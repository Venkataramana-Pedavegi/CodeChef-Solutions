import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int H = sc.nextInt();
        int C = sc.nextInt();

        int sandwiches = Math.min(B / 2, H + C);

        System.out.println(sandwiches);

        sc.close();
    }
}