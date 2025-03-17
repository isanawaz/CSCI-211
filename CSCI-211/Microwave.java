//package Project4;

/**
 * Class representing Microwave.
 * This class extends the Appliance class and adds specific attributes for microwave,
 * such as wattage.
 */
public class Microwave extends Appliance {
	private int watts;
	
	 /**
     * Constructor to initialize a microwave with a serial number, price, and wattage. 
     * 
     * @param serialNumber the unique serial number of the microwave
     * @param price the price of the microwave in dollars
     * @param watts power usage of the microwave in watts
     */
	
	public Microwave(String serialNumber, int price, int watts) {
		super(serialNumber, price);
		this.watts = watts;
	}
	
	/**
     * Returns the wattage of the microwave.
     * 
     * @return the power usage of the microwave in watts
     */
	public int getWatts() {
		return watts;
	}
	 
    /**
     * Returns a string representation of the Microwave object, including 
     * the serial number, price, and wattage.
     * 
     * @return a formatted string representation of the Microwave object
     */
	public String toString() {
		return super.toString() + ", Watts: " + watts;
	} 

}
