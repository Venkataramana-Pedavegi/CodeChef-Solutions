import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {

    static class CategoryStats {
        long count = 0;
        long total = 0;
        long max = 0;

        void addTransaction(long amount) {
            count++;
            total += amount;
            if (amount > max) {
                max = amount;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // TreeMap automatically keeps category names sorted lexicographically
        TreeMap<String, CategoryStats> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            long id = sc.nextLong();
            String category = sc.next();
            long amount = sc.nextLong();

            CategoryStats stats = map.get(category);
            if (stats == null) {
                stats = new CategoryStats();
                map.put(category, stats);
            }
            stats.addTransaction(amount);
        }

        String topCategory = null;
        long maxTotal = -1;

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, CategoryStats> entry : map.entrySet()) {
            String category = entry.getKey();
            CategoryStats stats = entry.getValue();

            sb.append(category).append(" ")
              .append(stats.count).append(" ")
              .append(stats.total).append(" ")
              .append(stats.max).append("\n");

            // Strictly greater (>): since TreeMap iterates in lexicographical order,
            // ties automatically preserve the lexicographically smaller category name.
            if (stats.total > maxTotal) {
                maxTotal = stats.total;
                topCategory = category;
            }
        }

        if (topCategory != null) {
            sb.append("TOP ").append(topCategory).append("\n");
        }

        System.out.print(sb);
    }
}