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
            
            // Start with the largest cup
            int maxWater = A[N-1];
            
            // Add the next K largest cups (or as many as possible)
            for (int i = 0; i < K && N-2-i >= 0; i++) {
                maxWater += A[N-2-i];
            }
            
            System.out.println(maxWater);
        }
    }
}
