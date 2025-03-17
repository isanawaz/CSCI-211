//package Project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Comparator;
import java.util.TreeMap; 

/**
 * A GUI application for managing and displaying appliances.
 * Supports viewing refrigerators, dishwashers, and microwaves in separate sections,
 * and provides functionality to search appliances by type and price.
 */
public class ApplianceGUI extends JFrame {
    private JFrame myFrame; // Main application window
    private Container cPane; // Container for adding components to the frame
    private TextArea refrigeratorsArea, dishwashersArea, microwavesArea; // Displays appliance info by category
    private TreeMap<String, Appliance> refrigerators; // Stores refrigerator data
    private TreeMap<String, Appliance> dishwashers; // Stores dishwasher data
    private TreeMap<String, Appliance> microwaves; // Stores microwave data

    /**
     * Initializes the GUI application with layout, components, and data structures.
     */
    public ApplianceGUI() {
        // Initialize data structures for each appliance category
        refrigerators = new TreeMap<>(new ApplianceComparator());
        dishwashers = new TreeMap<>(new ApplianceComparator());
        microwaves = new TreeMap<>(new ApplianceComparator());

        // Initialize display areas for each appliance type
        refrigeratorsArea = new TextArea();
        dishwashersArea = new TextArea();
        microwavesArea = new TextArea();

        // Set up the main application window
        myFrame = new JFrame();
        myFrame.setSize(1200, 400);
        myFrame.setLocation(200, 200);
        myFrame.setTitle("Appliances");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use a BorderLayout for organizing components
        myFrame.setLayout(new BorderLayout());

        // Create and set up the menu bar
        FileMenuHandler fileHandler = new FileMenuHandler(this);
        myFrame.setJMenuBar(createMenuBar(fileHandler));

        // Create a panel for the search functionality
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton searchButton = new JButton("Search Appliances");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchAppliances(); // Trigger appliance search
            }
        });
        topPanel.add(searchButton); // Add search button to the top panel

        // Add the top panel to the north region of the frame
        myFrame.add(topPanel, BorderLayout.NORTH);

        // Create a panel to display appliances in three columns
        JPanel appliancesPanel = new JPanel(new GridLayout(1, 3));
        appliancesPanel.add(refrigeratorsArea); // Left column: Refrigerators
        appliancesPanel.add(dishwashersArea); // Middle column: Dishwashers
        appliancesPanel.add(microwavesArea); // Right column: Microwaves

        // Add the appliances panel to the center region of the frame
        myFrame.add(appliancesPanel, BorderLayout.CENTER);

        // Make the application window visible
        myFrame.setVisible(true);
    }

    /**
     * Creates a menu bar with File menu options for opening files or exiting the application.
     *
     * @param handler A handler for managing file-related actions.
     * @return A JMenuBar with File menu options.
     */
    public JMenuBar createMenuBar(FileMenuHandler handler) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem quitItem = new JMenuItem("Quit");

        openItem.addActionListener(handler);
        quitItem.addActionListener(handler);

        fileMenu.add(openItem);
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);

        return menuBar;
    }

    /**
     * Adds a new appliance to the appropriate category and updates the display.
     *
     * @param appliance The appliance to add.
     */
    public void addAppliance(Appliance appliance) {
        if (appliance instanceof Refrigerator) {
            refrigerators.put(appliance.getSerialNumber(), appliance);
        } else if (appliance instanceof Dishwasher) {
            dishwashers.put(appliance.getSerialNumber(), appliance);
        } else if (appliance instanceof Microwave) {
            microwaves.put(appliance.getSerialNumber(), appliance);
        }
        updateDisplay(); // Refresh the display areas
    }

    /**
     * Refreshes the display areas with the latest appliance data.
     */
    private void updateDisplay() {
        // Clear text areas before updating
        refrigeratorsArea.setText("");
        dishwashersArea.setText("");
        microwavesArea.setText("");

        // Append appliance details to the respective text areas
        for (Appliance appliance : refrigerators.values()) {
            refrigeratorsArea.append(appliance.toString() + "\n");
        }
        for (Appliance appliance : dishwashers.values()) {
            dishwashersArea.append(appliance.toString() + "\n");
        }
        for (Appliance appliance : microwaves.values()) {
            microwavesArea.append(appliance.toString() + "\n");
        }
    }

    /**
     * Prompts the user to input search criteria and performs a search for matching appliances.
     */
    private void searchAppliances() {
        String input = JOptionPane.showInputDialog("Enter search criteria:");
        if (input != null && !input.isEmpty()) {
            String[] parts = input.split(",");
            if (parts.length == 2) {
                String type = parts[0].trim().toUpperCase();
                int price;
                try {
                    price = Integer.parseInt(parts[1].trim());
                    displaySearchResults(type, price);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Invalid price format.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid input format.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Displays the appliances that match the given type and price criteria.
     *
     * @param type The appliance type to search ("R" for Refrigerators, "D" for Dishwashers, "M" for Microwaves).
     * @param price The maximum price of the appliances to display.
     */
    private void displaySearchResults(String type, int price) {
        TreeMap<String, Appliance> selectedMap = null;

        if (type.equals("R")) {
            selectedMap = refrigerators;
        } else if (type.equals("D")) {
            selectedMap = dishwashers;
        } else if (type.equals("M")) {
            selectedMap = microwaves;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid appliance type.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder results = new StringBuilder();
        selectedMap.forEach((k, v) -> {
            if (v.getPrice() <= price) {
                results.append(v).append("\n");
                System.out.println("Serial Number: " + v.getSerialNumber() + ", Price: " + v.getPrice());
            }
        });
    }

    /**
     * Comparator for sorting appliances by their serial numbers.
     */
    private class ApplianceComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}

