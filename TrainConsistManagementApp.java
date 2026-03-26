import java.util.*;

/**
 * UC14: Custom Exception for Invalid Bogie Capacity
 */

/* ---------- Custom Exception ---------- */

class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

/* ---------- Passenger Bogie Class ---------- */

class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(type + " Bogie - Capacity: " + capacity);
    }
}

/* ---------- Main Application ---------- */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Train Consist Management App - UC14 ");
        System.out.println("======================================");

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // Valid bogies
            train.add(new PassengerBogie("Sleeper", 72));
            train.add(new PassengerBogie("AC Chair", 56));

            // Invalid bogie (will throw exception)
            train.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : train) {
            b.display();
        }

        System.out.println("\nProgram continues safely after handling exception.");
    }
}