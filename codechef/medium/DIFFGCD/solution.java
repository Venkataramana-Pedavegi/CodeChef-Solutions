import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long N = sc.nextLong();
            long ans = 0;
            
            for (long d = 1; d < N; d++) {
                ans += (N - d) / d;
            }
            
            System.out.println(ans);
        }
    }
}
