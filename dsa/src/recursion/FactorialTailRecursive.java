package recursion;

import java.util.Scanner;

public class FactorialTailRecursive {
	static int fact(int n,int k,int count) {
		if(n==1) {
			return k; 
		}
		k*=(count+1);
		return fact(n-1,k,count+1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//in.skip("\\n");
		System.out.println(fact(n,1,1));
		in.close();
	}
}
