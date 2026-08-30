import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ratedusers = n-a;
		int highRatedUsers =n-a-b;
		System.out.println(ratedusers + " "+highRatedUsers);
		
	}
}
