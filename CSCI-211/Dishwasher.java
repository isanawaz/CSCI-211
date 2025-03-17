//package Project4;

/**
 * Represents a Dishwasher, a type of Appliance.
 * Extends the Appliance class and includes specific functionality related to dishwashers, 
 * such as support for under-counter installation.
 */
public class Dishwasher extends Appliance {
    private boolean underCounterInstallation;

    /**
     * Initializes a Dishwasher object with the specified serial number, price, 
     * and under-counter installation capability.
     * 
     * @param serialNumber the unique identifier for the dishwasher
     * @param price the cost of the dishwasher in dollars
     * @param underCounterInstallation indicates if the dishwasher is suitable 
     *        for under-counter installation (true or false)
     */
    public Dishwasher(String serialNumber, int price, boolean underCounterInstallation) {
        // Initialize the Appliance attributes (serial number and price)
        super(serialNumber, price);
        // Set the under-counter installation property specific to dishwashers
        this.underCounterInstallation = underCounterInstallation;
    }

    /**
     * Retrieves the under-counter installation capability of the dishwasher.
     * 
     * @return true if under-counter installation is supported; false otherwise
     */
    public boolean getUnderCounterInstallation() { 
        return underCounterInstallation; 
    }

    /**
     * Returns a string representation of the Dishwasher object.
     * Overrides the toString method in the Appliance class to include 
     * dishwasher-specific details.
     * 
     * @return a formatted string containing the serial number, price, 
     *         and under-counter installation status
     */
    public String toString() {
        return super.toString() + ", Under-Counter Installation: " + underCounterInstallation;
    }
}

