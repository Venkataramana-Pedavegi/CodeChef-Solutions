import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int[] A =new int[L];
		for(int i=0;i<L;i++){
		    A[i]=sc.nextInt();
		}
		int N=sc.nextInt();
		int D=sc.nextInt();
		int count=0;
		for(int i=0;i<L;i++){
		    if (Math.abs(A[i]-N)<=D){
		        count++;
		    }
		}
		if(count==0){
		    System.out.println(-1);
		}else{
		    System.out.println(count);
		
		}
		sc.close();
		

	}
}
