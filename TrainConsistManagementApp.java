import java.util.*;

/**
 * UC7: Sort Bogies by Capacity using Comparator
 * Demonstrates sorting of custom objects based on business logic.
 *
 * @author Anurag
 * @version 7.0
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

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " → " + b.getCapacity());
        }

        System.out.println("\nNow bogies are ordered based on capacity for planning.");
    }
}