import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[][] garden = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                garden[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(kthSmallest(garden, k));
        sc.close();
    }

    // Binary search on value range
    static int kthSmallest(int[][] matrix, int k) {
        int N = matrix.length;
        int low = matrix[0][0];
        int high = matrix[N-1][N-1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Count how many numbers are <= mid
    static int countLessEqual(int[][] matrix, int mid) {
        int N = matrix.length;
        int count = 0;
        int row = N - 1, col = 0;
        
        while (row >= 0 && col < N) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }
}
