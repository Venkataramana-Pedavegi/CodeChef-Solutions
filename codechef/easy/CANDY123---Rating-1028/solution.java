import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int limak = 0;
            int bob = 0;
            int eat = 1;

            while (true) {

                if (eat % 2 == 1) {
                    // Limak's turn
                    limak += eat;

                    if (limak > A) {
                        System.out.println("Bob");
                        break;
                    }
                } else {
                    // Bob's turn
                     bob += eat;

                    if (bob > B) {
                        System.out.println("Limak");
                        break;
                    }
                }

                eat++;
            }
        }

        sc.close();

	}
}
