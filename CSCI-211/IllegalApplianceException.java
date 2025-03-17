//package Project4;

/**
 * Custom exception class to handle invalid appliance data, specifically invalid serial numbers.
 * This class extends {@link IllegalArgumentException} to represent an illegal argument case
 * when an appliance's serial number does not meet the required validation criteria.
 */ 
public class IllegalApplianceException extends IllegalArgumentException {
	public IllegalApplianceException(String message) {
		super(message); // Call the superclass constructor with the provided message
	}
}
