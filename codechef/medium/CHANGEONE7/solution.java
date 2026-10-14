import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();  // size of array
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            // Two possible ranges after changing one element
            int option1 = arr[N-1] - arr[1];   // change the minimum
            int option2 = arr[N-2] - arr[0];   // change the maximum
            
            System.out.println(Math.min(option1, option2));
        }
    }
}
