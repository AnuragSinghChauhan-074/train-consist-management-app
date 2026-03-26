import java.util.*;

/**
 * UC10: Count Total Seats using Stream reduce()
 * Demonstrates aggregation of seating capacity.
 *
 * @author Anurag
 * @version 10.0
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
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBogie Details:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        // Aggregate total capacity using stream
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)      // extract capacity
                .reduce(0, Integer::sum);     // sum all values

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nOriginal list remains unchanged: " + bogies.size());
    }
}