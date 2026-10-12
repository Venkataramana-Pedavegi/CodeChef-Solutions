
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] houses = new int[n];

        for (int i = 0; i < n; i++) {
            houses[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] sprinklers = new int[m];

        for (int i = 0; i < m; i++) {
            sprinklers[i] = sc.nextInt();
        }

        Arrays.sort(houses);
        Arrays.sort(sprinklers);

        int maxRadius = 0;

        for (int house : houses) {
            int low = 0;
            int high = m - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (sprinklers[mid] < house) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            int rightDistance = Math.abs(sprinklers[low] - house);
            int leftDistance = Integer.MAX_VALUE;

            if (low > 0) {
                leftDistance = Math.abs(sprinklers[low - 1] - house);
            }

            int distance = Math.min(leftDistance, rightDistance);
            maxRadius = Math.max(maxRadius, distance);
        }

        System.out.println(maxRadius);
        sc.close();
    }
}
