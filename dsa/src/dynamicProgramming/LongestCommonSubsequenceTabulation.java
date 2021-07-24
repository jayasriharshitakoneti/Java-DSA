package dynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequenceTabulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		int m = s1.length();
		int n = s2.length();
		int memo[][] = new int[m + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			memo[0][i] = 0;
		}
		for (int i = 0; i < m + 1; i++) {
			memo[i][0] = 0;
		}
		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					memo[i][j] =1+ (memo[i - 1][j-1]);
				}
				else {
					memo[i][j] =Math.max(memo[i - 1][j], memo[i][j - 1]);
				}
			}
		}
		System.out.println(memo[m][n]);
		in.close();
	}
}
