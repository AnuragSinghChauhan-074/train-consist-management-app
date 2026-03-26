import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9: Group Bogies by Type using groupingBy
 * Demonstrates categorizing bogies into structured groups.
 *
 * @author Anurag
 * @version 9.0
 */

public class TrainConsistManagementApp {

    /* ---------- Bogie Class ---------- */
    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Train Consist Management App");
        System.out.println("======================================");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));   // duplicate type for grouping
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 60));

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogies:");

        // Display grouped result
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            String type = entry.getKey();
            List<Bogie> groupList = entry.getValue();

            System.out.println("\n" + type + " Bogies:");

            for (Bogie b : groupList) {
                System.out.println("Capacity: " + b.getCapacity());
            }
        }

        System.out.println("\nTotal Categories: " + groupedBogies.size());

        System.out.println("\nOriginal list remains unchanged: " + bogies.size());
    }
}