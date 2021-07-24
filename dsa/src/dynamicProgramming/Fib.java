package dynamicProgramming;

import java.util.Scanner;

public class Fib {

	
	static int fibonacci(int n,int[] memo) {
		if(memo[n]==-1) {
			if(n==0 || n==1) {
				memo[n]=n;
			}
			else {
				memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo);
			}
		}
		for(int i=0;i<n+1;i++)
			System.out.print(memo[i]+" ");
		System.out.println();
		return memo[n];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] memo=new int[n+1];
		for(int i=0;i<n+1;i++) {
			memo[i]=-1;
		}
		System.out.println(fibonacci(n,memo));
		in.close();
	}

}
