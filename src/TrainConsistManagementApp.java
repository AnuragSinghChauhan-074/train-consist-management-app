import java.util.*;

/**
 * UC1: Initialize Train and Display Consist Summary
 * Demonstrates application startup and dynamic list initialization.
 *
 * @author Anurag
 * @version 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Train Consist Management App");
        System.out.println("======================================");

        // Initialize empty consist (no bogies yet)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("\nTrain initialized successfully.");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nSystem ready for next operations...");
    }
}