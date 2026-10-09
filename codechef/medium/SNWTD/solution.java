
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int digitSum = 0;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            if (digitSum == d) {
                System.out.println(arr[i]);
                sc.close();
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }
}
