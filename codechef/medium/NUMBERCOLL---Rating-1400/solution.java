import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int validCount = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String token = sc.next();

            // Strip leading '+' sign if present for standard parsing
            String parseableToken = token;
            if (token.startsWith("+") && token.length() > 1 && token.charAt(1) != '+') {
                parseableToken = token.substring(1);
            }

            try {
                long val = Long.parseLong(parseableToken);
                validCount++;
                sum += val;
            } catch (NumberFormatException e) {
                // Skips strings that are invalid
            }
        }

        System.out.println(validCount + " " + sum);
    }
}