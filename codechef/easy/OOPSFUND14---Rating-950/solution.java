import java.util.*;

// Write the complete QuadraticEquation class here.
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public int getRootCount() {
        double d = getDiscriminant();
        if (d > 0) {
            return 2;
        } else if (d == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            QuadraticEquation eq =
                new QuadraticEquation(a, b, c);

            int count = eq.getRootCount();

            if (count == 0) {
                output.append("No real solutions\n");
            }
            else if (count == 1) {
                double x = eq.getRoot1();

                if (Math.abs(x) < 0.005)
                    x = 0;

                output.append(String.format(
                    Locale.US, "One Root: %.2f%n", x
                ));
            }
            else {
                double x = eq.getRoot1();
                double y = eq.getRoot2();

                if (Math.abs(x) < 0.005)
                    x = 0;

                if (Math.abs(y) < 0.005)
                    y = 0;

                output.append(String.format(
                    Locale.US,
                    "Two Roots: %.2f %.2f%n", x, y
                ));
            }
        }

        System.out.print(output);
        sc.close();
    }
}
