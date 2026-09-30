import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int flip=0;
		    int count=0;
		    for(int i=0;i<N;i++){
		        int bulb=sc.nextInt();
		        if(flip == 1){
		            bulb=1-bulb;
		        }
		        if(bulb==0){
		            count++;
		            flip =1-flip;
		        }
		    }
		    System.out.println(count);
		}
		sc.close();

	}
}
