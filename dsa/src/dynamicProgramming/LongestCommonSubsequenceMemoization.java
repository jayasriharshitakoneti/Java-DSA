package dynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequenceMemoization {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		int m=s1.length();
		int n=s2.length();
		int memo[][]=new int[m+1][n+1];
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				memo[i][j]=-1;
			}
		}
		System.out.println(lcs(s1,s2,m,n,memo));
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				System.out.print(memo[i][j]+" ");
			}
			System.out.println();
		}
		in.close();
	}

	private static int lcs(String s1, String s2,int m,int n,int memo[][]) {
		
		System.out.println("Next");
		if(memo[m][n]==-1) {
			if(n==0 || m==0) {
				memo[m][n]=0;
			}
			else if(s1.charAt(m-1)==s2.charAt(n-1)) {
				memo[m][n]=1+lcs(s1,s2,m-1,n-1,memo);
			}
			else {
				memo[m][n]=Math.max(lcs(s1,s2,m-1,n,memo),lcs(s1,s2,m,n-1,memo));
			}
		}
		return memo[m][n];
	}
	
}
