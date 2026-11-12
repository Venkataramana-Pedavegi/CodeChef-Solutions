import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int L = sc.nextInt();
            int[] A = new int[L];
            
            for (int i = 0; i < L; i++) {
                A[i] = sc.nextInt();
            }
            
            int N = sc.nextInt();
            int D = sc.nextInt();
            
            int count = 0;
            for (int i = 0; i < L; i++) {
                if (Math.abs(A[i] - N) <= D) {
                    count++;
                }
            }
            
            System.out.println(count == 0 ? -1 : count);
        }
    }
}