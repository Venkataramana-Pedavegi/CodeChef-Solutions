import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; ++i) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < n; ++i) {
            if ((pairs[i][0] == a && pairs[i][1] == b) || (pairs[i][0] == b && pairs[i][1] == a)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}