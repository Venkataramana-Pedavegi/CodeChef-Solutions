import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int H = sc.nextInt();
		
		int totalCost = X + (H - 1) * Y;
		
		System.out.println(totalCost);


	}
}
