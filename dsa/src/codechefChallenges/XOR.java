package codechefChallenges;
import java.util.*;
//import java.lang.*;
//import java.io.*;

public class XOR {

	static int xorr(int[] a,int max,float count,int p,float k) {
		p=(int)(Math.log(max) / Math.log(2));
		int ans=0;
		
		for(int i=0;i<=p;i++) {
			for (int j=0;j<a.length;j++) {
				if((a[j]&(1<<i))!=0) {//(1<<i)
					count++;
				}
			}
			ans+=Math.ceil(count/k);
			count=0;
		}

		return ans;
	}
	
	static int max(int[] a,int n,int k){
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return xorr(a,max,0,1,k);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int t = 0;t<test;t++){
		    int n=in.nextInt();
		    int k=in.nextInt();
		    int[] a=new int[n];
		    for (int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
//		    in.skip("\\n");
		    System.out.println(max(a,n,k));
		}
		in.close();
	}
}
/* package codechef; // don't place package name! */

