//package Project4;

/**
 * Represents a general appliance as an abstract base class.
 * This class provides shared attributes and behaviors for all appliance types.
 * Subclasses should extend this class to implement specific appliance details.
 */ 
public abstract class Appliance {
    protected String serialNumber;  // Unique identifier for the appliance
    protected int price;            // Price of the appliance in dollars

    /**
     * Constructs an appliance with the specified serial number and price.
     *
     * @param serialNumber the unique identifier for the appliance
     * @param price the cost of the appliance in dollars
     */ 
    public Appliance(String serialNumber, int price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    /**
     * Retrieves the serial number of this appliance.
     *
     * @return the unique serial number
     */ 
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Retrieves the price of this appliance.
     *
     * @return the price in dollars
     */
    public int getPrice() {
        return price;
    }

    /**
     * Provides a string representation of this appliance, including its serial number and price.
     *
     * @return a formatted string with the serial number and price
     */
    public String toString() {
        return "Serial: " + serialNumber + ", Price: $" + price;
    }

    /**
     * Compares this appliance to another appliance based on their serial numbers.
     * Useful for sorting appliances by their serial numbers.
     *
     * @param other the appliance to compare to
     * @return a negative integer, zero, or a positive integer if this serial number
     *         is less than, equal to, or greater than the other appliance's serial number
     */
    public int compareTo(Appliance other) { 
        return serialNumber.compareTo(other.serialNumber);
    } 

}

