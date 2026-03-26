import java.util.*;
import java.util.stream.Collectors;

/**
 * UC13: Performance Comparison (Loops vs Streams)
 * Measures execution time using System.nanoTime()
 */

class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Train Consist Management App - UC13 ");
        System.out.println("======================================");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, (i % 100) + 20));
        }

        System.out.println("Total Bogies: " + bogies.size());

        /* ---------------- LOOP BASED FILTERING ---------------- */

        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;

        /* ---------------- STREAM BASED FILTERING ---------------- */

        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        long streamTime = streamEnd - streamStart;

        /* ---------------- RESULTS ---------------- */

        System.out.println("\nLoop Result Count   : " + loopResult.size());
        System.out.println("Stream Result Count : " + streamResult.size());

        System.out.println("\nLoop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        System.out.println("\nPerformance comparison completed.");
    }
}