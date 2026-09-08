import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int dsaD = sc.nextInt();
            int tocD = sc.nextInt();
            int dmD = sc.nextInt();

            int dsaS = sc.nextInt();
            int tocS = sc.nextInt();
            int dmS = sc.nextInt();

            int totalD = dsaD + tocD + dmD;
            int totalS = dsaS + tocS + dmS;

            if (totalD > totalS) {
                System.out.println("DRAGON");
            } 
            else if (totalS > totalD) {
                System.out.println("SLOTH");
            } 
            else if (dsaD > dsaS) {
                System.out.println("DRAGON");
            } 
            else if (dsaS > dsaD) {
                System.out.println("SLOTH");
            } 
            else if (tocD > tocS) {
                System.out.println("DRAGON");
            } 
            else if (tocS > tocD) {
                System.out.println("SLOTH");
            } 
            else {
                System.out.println("TIE");
            }
        }

        sc.close();

	}
}
