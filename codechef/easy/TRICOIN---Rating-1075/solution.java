import java.util.Scanner;

class Codechef {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            // Binary search range for the height h
            long low = 1;
            long high = 2000000000L; // Safe upper bound since N <= 10^9
            long ans = 1;
            
            while (low <= high) {
                long mid = low + (high - low) / 2;
                
                // Calculate coins needed for height 'mid' using formula: mid * (mid + 1) / 2
                // Use long to prevent integer overflow during multiplication
                long coinsNeeded = mid * (mid + 1) / 2;
                
                if (coinsNeeded <= n) {
                    ans = mid;         // 'mid' is a valid height, try to find a larger one
                    low = mid + 1;
                } else {
                    high = mid - 1;    // Too many coins required, try a smaller height
                }
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}