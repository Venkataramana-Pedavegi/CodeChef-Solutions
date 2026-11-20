import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

// Implement the complete Equation and LinearEquation classes here.
class Equation {
    private long a;
    private long b;

    public Equation(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }
}

class LinearEquation extends Equation {
    private long c;
    private long d;

    public LinearEquation(long a, long b, long c, long d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    public int getSolutionType() {
        long diffCoeff = getA() - c;
        long diffConst = d - getB();

        if (diffCoeff != 0) {
            return 1;
        } else if (diffConst != 0) {
            return 0;
        } else {
            return 2;
        }
    }

    public double getSolution() {
        return (double) (d - getB()) / (getA() - c);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        for (int t = 0; t < T; t++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            LinearEquation eq = new LinearEquation(a, b, c, d);
            int type = eq.getSolutionType();

            if (type == 0) {
                out.append("No solution\n");
            }
            else if (type == 2) {
                out.append("Infinite solutions\n");
            }
            else {
                double x = eq.getSolution();

                String rounded = BigDecimal.valueOf(x)
                        .setScale(2, RoundingMode.HALF_UP)
                        .toPlainString();

                out.append("One solution: ")
                   .append(rounded)
                   .append('\n');
            }
        }

        System.out.print(out);
        sc.close();
    }
}
