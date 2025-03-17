// TextFileInput.java
package Project4; 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * A simplified class for reading from a text file using buffered character input streams.
 * Manages an input text file, handling any IOExceptions by throwing RuntimeExceptions
 * with error messages.
 *
 * If the text file cannot be created, a RuntimeException is thrown, which by default 
 * results in an error message being printed to the standard error stream.
 *
 * @author D. Nixon
 */
public class TextFileInput  {

   /**  Name of the input text file.  */
   private String filename;

   /**  BufferedReader for reading characters from the file.  */
   private BufferedReader br;  

   /**  Count of lines read so far.  */
   private int lineCount = 0;

   /**
    * Constructs a TextFileInput object for the specified input file.
    *
    * @param filename the input text file.
    * @exception RuntimeException if an IOException occurs when attempting to open the file.
    */
   public TextFileInput(String filename)
   {
      this.filename = filename;
      try  {
         br = new BufferedReader(
                  new InputStreamReader(
                      new FileInputStream(filename)));
      } catch ( IOException ioe )  {
         throw new RuntimeException(ioe);
      }  
   }  

   /**
    * Closes the character input stream. Once closed, no further characters can be read.
    * 
    * @exception NullPointerException if the file is already closed.
    * @exception RuntimeException if an IOException occurs when closing the file.
    */
   public void close()
   {
      try  {
         br.close();
         br = null;
      } catch ( NullPointerException npe )  {
         throw new NullPointerException(
                        filename + " is already closed.");
      } catch ( IOException ioe )  {
         throw new RuntimeException(ioe);
      }  
   }  

   /**
    * Reads a line from the file, advancing the cursor to the next line.
    * The end-of-line marker is removed.
    *
    * @return the line of text.
    * @exception RuntimeException if an IOException occurs when reading from the file.
    */
   public String readLine()
   {
      return readLineOriginal();
   }  

   /**
    * Returns the number of lines read from the file so far.
    */
   public int getLineCount()  { return lineCount; }

   /**
    * Checks if the specified character matches any of the options, ignoring case.
    *
    * @param toBeChecked the character to check.
    * @param options an array of acceptable characters.
    * @return true if the character matches any option, false otherwise.
    */
   public static boolean isOneOf(char toBeChecked,
                                 char[] options)
   {
      boolean oneOf = false;
      for ( int i = 0; i < options.length && !oneOf; i++ )
         if ( Character.toUpperCase(toBeChecked)
                   == Character.toUpperCase(options[i]) )
            oneOf = true;
      return oneOf;
   }  

   /**
    * Checks if the specified string matches any of the options, ignoring case.
    *
    * @param toBeChecked the string to check.
    * @param options an array of acceptable strings.
    * @return true if the string matches any option, false otherwise.
    */
   public static boolean isOneOf(String toBeChecked,
                                 String[] options)
   {
      boolean oneOf = false;
      for ( int i = 0; i < options.length && !oneOf; i++ )
         if ( toBeChecked.equalsIgnoreCase(options[i]) )
            oneOf = true;
      return oneOf;
   }  

   /**
    * Reads a line from the file and checks if it matches any of the specified options.
    *
    * @param options an array of valid options.
    * @return the line of text if it matches an option, null otherwise.
    * @exception RuntimeException if the line does not match any of the options or if an IOException occurs.
    * @exception NullPointerException if no options are provided or if the end of the file is reached.
    */
   public String readSelection(String[] options)
   {
      if ( options == null || options.length == 0 )
         throw new NullPointerException(
                            "No options provided for selection in file "
                            + filename + ", line " 
                            + (lineCount + 1) + ".");

      String answer = readLine();

      if ( answer == null )
         throw new NullPointerException(
                            "End of file " + filename + " has been reached.");

      if ( !TextFileInput.isOneOf(answer, options) )  {
         String optionString = options[0];
         for ( int i = 1; i < options.length; i++ )
            optionString += ", " + options[i];
         throw new RuntimeException("File " + filename
                            + ", line " + lineCount
                            + ": \"" + answer
                            + "\" is not one of "
                            + optionString + ".");
      }  
      return answer;
  }  

   /**
    * Reads a line and checks if it matches any of the boolean-like options ("Y", "N", "yes", "no", etc.).
    * There should be no extra characters on the line.
    *
    * @return true if the line matches one of the affirmative options, false if it matches one of the negative options.
    * @exception RuntimeException if the line does not match any boolean-like option or if an IOException occurs.
    * @exception NullPointerException if the end of the file is reached.
    */
   public boolean readBooleanSelection()
   {
      String[] options = {"Y", "N", "yes", "no", "1", "0",
                          "T", "F", "true", "false"};
      String answer = readSelection(options);
      return isOneOf(answer,
                     new String[] {"Y", "yes", "1", "T", "true"} );
   }  

   /**
    * Reads a line from the file and increments the line count.
    * This method is used by the public readLine method and is final to avoid side effects 
    * when the public readLine method is overridden.
    *
    * @return the line of text with the end-of-line marker removed.
    * @exception RuntimeException if an IOException occurs when reading from the file.
    */
   protected final String readLineOriginal()
   {
       try  {
          if ( br == null )
             throw new RuntimeException(
                                "Cannot read from closed file " + filename + ".");
          String line = br.readLine();
          if ( line != null )
             lineCount++;
          return line;
       } catch (IOException ioe)  {
          throw new RuntimeException(ioe);
       }  
   }  
}  // class TextFileInput

