import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If the slope is rising, the peak must be to the right
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                // Otherwise, we are on the falling slope or at the peak
                high = mid;
            }
        }
        
        System.out.println(arr[low]);
    }
}