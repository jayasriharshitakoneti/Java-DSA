package dynamicProgramming;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int sum=in.nextInt();
		System.out.println(count(a,n,sum));
		in.close();
	}

	private static int count(int[] a, int n, int sum) {
		int result;
		if(sum==0) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
//		else {
			result=count(a,n-1,sum);
			if(sum>=a[n-1]) {
				result=result+count(a,n,sum-a[n-1]);
			}
//			else {
//				result=count(a,n-1,sum,ans);
//			}
//			
//		}
		return result;
	}

}
