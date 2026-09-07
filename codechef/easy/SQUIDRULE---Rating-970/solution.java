import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long totalSum = 0; // Use long to prevent integer overflow
            int smallestElement = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                totalSum += val;
                smallestElement = Math.min(smallestElement, val);
            }
            
            // The maximum prize is total sum minus the smallest element
            System.out.println(totalSum - smallestElement);
        }
        scanner.close();

	}
}
