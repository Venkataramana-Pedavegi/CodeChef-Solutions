import java.util.*;

class EnergyGrid {
    private int buildingId;
    private String buildingName;
    private double unitsConsumed;
    private double ratePerUnit;

    public EnergyGrid(int id, String name, double units, double rate) {
        this.buildingId = id;
        this.buildingName = name;
        this.unitsConsumed = units;
        this.ratePerUnit = rate;
    }

    public double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    public double calculateOptimizedBill() {
        double optimizedUnits = unitsConsumed;

        if (unitsConsumed > 500) {
            optimizedUnits *= 0.90;
        }

        return optimizedUnits * ratePerUnit;
    }

    public void displayDetails() {
        double original = calculateBill();
        double optimized = calculateOptimizedBill();

        System.out.println("Building ID: " + buildingId);
        System.out.println("Building Name: " + buildingName);

        System.out.printf(Locale.US,
                "Original Bill: %.1f%n", original);

        System.out.printf(Locale.US,
                "Optimized Bill: %.1f%n", optimized);

        System.out.printf(Locale.US,
                "Savings: %.1f%n", original - optimized);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double units = sc.nextDouble();
            double rate = sc.nextDouble();

            EnergyGrid building =
                new EnergyGrid(id, name, units, rate);

            if (i > 0) System.out.println();
            building.displayDetails();
        }

        sc.close();
    }
}
