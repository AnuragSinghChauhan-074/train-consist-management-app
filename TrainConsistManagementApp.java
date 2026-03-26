import java.util.*;

/**
 * UC6: Map Bogie to Capacity using HashMap
 * Demonstrates key-value mapping of bogies to capacity.
 *
 * @author Anurag
 * @version 6.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Train Consist Management App");
        System.out.println("======================================");

        // Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogie-capacity mappings
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        System.out.println("\nBogie Capacity Details:");

        // Iterate using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {

            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " → Capacity: " + capacity);
        }

        System.out.println("\nTotal Bogie Types: " + bogieCapacityMap.size());

        System.out.println("\nSystem can now map bogies to real-world attributes.");
    }
}