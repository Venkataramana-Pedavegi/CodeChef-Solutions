import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        StringBuilder result = new StringBuilder();

        while (i < n && j < m) {

            if (A[i] <= B[j]) {
                result.append(A[i]).append(" ");
                i++;
            } else {
                result.append(B[j]).append(" ");
                j++;
            }
        }

        // Remaining elements of A
        while (i < n) {
            result.append(A[i]).append(" ");
            i++;
        }

        // Remaining elements of B
        while (j < m) {
            result.append(B[j]).append(" ");
            j++;
        }

        System.out.println(result.toString().trim());

	}
}
