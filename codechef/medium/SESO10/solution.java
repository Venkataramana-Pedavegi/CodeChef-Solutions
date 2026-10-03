import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int sum = pairs[i][0] + pairs[i][1];
            int product = pairs[i][0] * pairs[i][1];
            
            if (sum >= left && sum <= right && product >= left && product <= right) {
                System.out.println(pairs[i][0] + " " + pairs[i][1]);
            }
        }
        
        scanner.close();
    }
}