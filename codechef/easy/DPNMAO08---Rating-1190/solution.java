import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n <= 3) {
            System.out.println(0);
            return;
        }

        ArrayList<Integer> evenPos = new ArrayList<>();
        ArrayList<Integer> oddPos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenPos.add(arr[i]);
            } else {
                oddPos.add(arr[i]);
            }
        }
        Collections.sort(evenPos);
        Collections.sort(oddPos);

        int secondLargestEven = evenPos.get(evenPos.size() - 2);
        int secondSmallestOdd = oddPos.get(1);

        System.out.println(secondLargestEven + secondSmallestOdd);
    }
}