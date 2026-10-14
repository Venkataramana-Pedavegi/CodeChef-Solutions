import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            Arrays.sort(A);
            
            if (K >= N-1) {
                // All cups eventually merge into one
                int total = 0;
                for (int x : A) total += x;
                System.out.println(total);
            } else {
                // Answer is the (N-K-1)-th element after sorting
                System.out.println(A[N-K-1]);
            }
        }
    }
}
