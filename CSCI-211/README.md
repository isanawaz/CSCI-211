# Appliance Management System

## Overview
The **Appliance Management System** is a Java-based application that allows users to manage and display appliances such as refrigerators, dishwashers, and microwaves. The system provides a graphical user interface (GUI) for viewing and searching appliances based on their serial numbers and price.

## Features
- **Graphical User Interface (GUI)** for easy interaction.
- **Supports multiple appliance types**: Refrigerators, Dishwashers, and Microwaves.
- **File handling**: Load appliance data from a text file.
- **Search functionality**: Filter appliances based on type and price.
- **Exception handling** for invalid appliance data.

## Installation and Usage

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or VS Code (optional).

### Compilation
1. Ensure all Java files are in the same directory.
2. Open a terminal or command prompt in the project directory.
3. Compile the project using:
   ```
   javac *.java
   ```

### Running the Application
After compiling, run the main class using:
```
java Project4
```

## Class Overview

### `Project4.java`
- The main entry point of the application.
- Initializes and launches the GUI.

### `Appliance.java`
- Abstract base class representing a general appliance.
- Contains common attributes: serial number and price.
- Provides a `compareTo` method for sorting appliances.

### `ApplianceGUI.java`
- Implements the graphical user interface (GUI).
- Displays appliances categorized by type.
- Provides a search function to filter appliances.

### `FileMenuHandler.java`
- Handles file operations, including opening a text file and reading appliance data.
- Validates appliance serial numbers and adds them to the GUI.

### `TextFileInput.java`
- Provides a utility for reading data from text files.

### `Refrigerator.java`
- Extends `Appliance` to represent a refrigerator.
- Includes storage capacity in cubic feet.

### `Dishwasher.java`
- Extends `Appliance` to represent a dishwasher.
- Includes information about under-counter installation.

### `Microwave.java`
- Extends `Appliance` to represent a microwave.
- Stores power consumption in watts.

### `IllegalApplianceException.java`
- Custom exception class for handling invalid appliance data.

## File Input Format
Appliance data should be stored in a text file with each line formatted as:
```
<serialNumber>, <price>, <additionalData>
```
- `serialNumber`: Must start with 'R' (Refrigerator), 'D' (Dishwasher), or 'M' (Microwave) followed by 11 alphanumeric characters.
- `price`: Integer value representing the price in dollars.
- `additionalData`:
  - For **Refrigerators**: cubic feet capacity.
  - For **Microwaves**: wattage.
  - For **Dishwashers**: 'Y' for under-counter installation, 'N' otherwise.

**Example file content:**
```
R12345678901, 800, 20
M98765432101, 150, 1000
D54321678901, 500, Y
```
