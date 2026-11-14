import java.util.*;

// Implement the complete classes here:
// 1. PrintJob
// 2. PrintPolicy
// 3. BasicPolicy
// 4. SupportPolicy
class PrintJob {
    private double length;
    private double width;
    private double height;
    private double volume;
    private String material;

    public void set_length(double l) {
        this.length = l;
    }

    public void set_width(double w) {
        this.width = w;
    }

    public void set_height(double h) {
        this.height = h;
    }

    public void set_material(String m) {
        this.material = m;
    }

    public void calculate_volume() {
        this.volume = this.length * this.width * this.height;
    }

    public double get_volume() {
        return this.volume;
    }

    public boolean matches(PrintJob other) {
        if (other == null) {
            return false;
        }
        return this.volume == other.volume && Objects.equals(this.material, other.material);
    }
}

abstract class PrintPolicy {
    public abstract double charge(PrintJob job);
}

class BasicPolicy extends PrintPolicy {
    @Override
    public double charge(PrintJob job) {
        return 2.0 * job.get_volume();
    }
}

class SupportPolicy extends PrintPolicy {
    private double extra;

    public SupportPolicy(double extra) {
        this.extra = extra;
    }

    @Override
    public double charge(PrintJob job) {
        return (2.0 * job.get_volume()) + this.extra;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        for (int t = 0; t < T; t++) {
            double l1 = sc.nextDouble();
            double w1 = sc.nextDouble();
            double h1 = sc.nextDouble();
            String m1 = sc.next();

            double l2 = sc.nextDouble();
            double w2 = sc.nextDouble();
            double h2 = sc.nextDouble();
            String m2 = sc.next();

            String mode = sc.next();
            double extra = sc.nextDouble();

            PrintJob a = new PrintJob();
            PrintJob b = new PrintJob();

            a.set_length(l1);
            a.set_width(w1);
            a.set_height(h1);
            a.set_material(m1);
            a.calculate_volume();

            b.set_length(l2);
            b.set_width(w2);
            b.set_height(h2);
            b.set_material(m2);
            b.calculate_volume();

            PrintPolicy policy = mode.equals("BASIC")
                ? new BasicPolicy()
                : new SupportPolicy(extra);

            output.append(a.matches(b)
                ? "Matching Jobs"
                : "Non-Matching Jobs").append('\n');

            output.append(String.format(
                Locale.US,
                "%.2f %.2f%n",
                policy.charge(a),
                policy.charge(b)
            ));
        }

        System.out.print(output);
        sc.close();
    }
}
