import java.util.*;

/**
 * UC12: Safety Compliance Check for Goods Bogies
 * Validates cargo rules using Streams and allMatch()
 */

class GoodsBogie {

    private String type;   // Cylindrical / Open / Box
    private String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Train Consist Management App - UC12 ");
        System.out.println("======================================");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie bogie : goodsBogies) {
            bogie.display();
        }

        // Safety validation using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Result
        if (isSafe) {
            System.out.println("\n✅ Train is SAFETY COMPLIANT");
        } else {
            System.out.println("\n❌ Train is NOT SAFE (Invalid Cargo Detected)");
        }

        System.out.println("\nSafety validation completed.");
    }
}