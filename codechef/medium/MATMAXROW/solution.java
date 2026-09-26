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

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = m - 1;
        int answer = -1;

        while (row < n && col >= 0) {

            if (matrix[row][col] == 1) {
                answer = row + 1;
                col--;
            } else {
                row++;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}