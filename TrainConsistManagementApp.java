import java.util.*;
import java.util.stream.Collectors;

/**
 * UC8: Filter Passenger Bogies using Stream API
 * Demonstrates filtering using functional programming style.
 *
 * @author Anurag
 * @version 8.0
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

        // Create bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        // Apply Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");

        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            for (Bogie b : filteredBogies) {
                System.out.println(b.getName() + " → " + b.getCapacity());
            }
        }

        System.out.println("\nOriginal list remains unchanged:");
        System.out.println("Total Bogies: " + bogies.size());
    }
}