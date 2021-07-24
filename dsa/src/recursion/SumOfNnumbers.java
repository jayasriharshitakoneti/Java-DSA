package recursion;

import java.util.Scanner;

public class SumOfNnumbers {
	static int sum(int n) {
		if(n<=1) {
			return n;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(sum(n));
		in.close();
	}

}
