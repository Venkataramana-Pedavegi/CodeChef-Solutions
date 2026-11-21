import java.util.*;

// Implement the following types:
// 1. LibraryMember
// 2. RegularMember
// 3. PremiumMember
interface LibraryMember {
    long Calculate_Fine();
    String Borrowing_Status();
}

class RegularMember implements LibraryMember {
    private int borrowed;
    private int late;

    public RegularMember(int borrowed, int late) {
        this.borrowed = borrowed;
        this.late = late;
    }

    @Override
    public long Calculate_Fine() {
        return 2L * late;
    }

    @Override
    public String Borrowing_Status() {
        if (borrowed < 5 && Calculate_Fine() == 0) {
            return "Eligible";
        }
        return "Not Eligible";
    }
}

class PremiumMember implements LibraryMember {
    private int borrowed;
    private int late;

    public PremiumMember(int borrowed, int late) {
        this.borrowed = borrowed;
        this.late = late;
    }

    @Override
    public long Calculate_Fine() {
        return Math.max(0L, late - 3L);
    }

    @Override
    public String Borrowing_Status() {
        if (borrowed < 10 && Calculate_Fine() == 0) {
            return "Eligible";
        }
        return "Not Eligible";
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            int borrowed = sc.nextInt();
            int late = sc.nextInt();

            LibraryMember member = type.equals("REGULAR")
                ? new RegularMember(borrowed, late)
                : new PremiumMember(borrowed, late);

            result.append(type)
                  .append(" Fine: ")
                  .append(member.Calculate_Fine())
                  .append(" Borrowing: ")
                  .append(member.Borrowing_Status())
                  .append('\n');
        }

        System.out.print(result);
        sc.close();
    }
}