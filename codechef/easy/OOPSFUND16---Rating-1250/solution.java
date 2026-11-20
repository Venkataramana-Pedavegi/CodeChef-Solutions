import java.util.*;

// Write the complete Sequence and ArithmeticProgression classes here.
class Sequence {
    private long a;
    private long d;

    public Sequence(long a, long d) {
        this.a = a;
        this.d = d;
    }

    public long getFirstTerm() {
        return a;
    }

    public long getDifference() {
        return d;
    }
}

class ArithmeticProgression extends Sequence {
    private long n;

    public ArithmeticProgression(long a, long d, long n) {
        super(a, d);
        this.n = n;
    }

    public long getLastTerm() {
        return getFirstTerm() + (n - 1) * getDifference();
    }

    public long getSum() {
        return (n * (2 * getFirstTerm() + (n - 1) * getDifference())) / 2;
    }

    public String getTrend() {
        long d = getDifference();
        if (d > 0) {
            return "INCREASING";
        } else if (d < 0) {
            return "DECREASING";
        } else {
            return "CONSTANT";
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            long a = sc.nextLong();
            long d = sc.nextLong();
            long n = sc.nextLong();

            ArithmeticProgression ap =
                new ArithmeticProgression(a, d, n);

            out.append(ap.getLastTerm()).append(' ')
               .append(ap.getSum()).append(' ')
               .append(ap.getTrend()).append('\n');
        }

        System.out.print(out);
        sc.close();
    }
}
