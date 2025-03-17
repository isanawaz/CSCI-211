//package Project4;

/**
 * Class representing a Refrigerator.
 * This class extends the Appliance class and includes specific attributes for a refrigerator,
 * such as its storage capacity in cubic feet.
 */
public class Refrigerator extends Appliance{
	private int cubicFeet;
	
	/**
     * Constructor to initialize a refrigerator with a serial number, price, and storage capacity in cubic feet. 
     * 
     * @param serialNumber the unique serial number of the refrigerator
     * @param price the price of the refrigerator in dollars
     * @param cubicFeet the storage capacity of the refrigerator in cubic feet
     */
	public Refrigerator(String serialNumber, int price, int cubicFeet) {
        super(serialNumber, price);
        this.cubicFeet = cubicFeet;
    }
	
	/**
     * Returns the storage capacity of the refrigerator in cubic feet.
     * 
     * @return the storage capacity of the refrigerator in cubic feet
     */
	public int getCubicFeet() {
        return cubicFeet;
    } 
	
	/**
     * Returns a string representation of the Refrigerator object, including 
     * the serial number, price, and storage capacity in cubic feet.
     * 
     * @return a formatted string representing the Refrigerator object
     */
	public String toString() {
        return super.toString() + ", Cubic Feet: " + cubicFeet;
    }
}

