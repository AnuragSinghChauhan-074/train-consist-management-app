import java.util.*;

/**
 * UC5: Preserve Insertion Order of Bogies using LinkedHashSet
 * Demonstrates uniqueness + order preservation.
 *
 * @author Anurag
 * @version 5.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Train Consist Management App");
        System.out.println("======================================");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies: " + trainFormation.size());

        System.out.println("\nDuplicate bogies are automatically ignored.");
    }
}