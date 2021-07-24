package basics;

import java.util.Scanner;

public class JpmcDecoding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int i = scan.nextInt();
		double d = scan.nextDouble();
		// String s = scan.nextLine();
		// scan.nextLine();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
		scan.close();
	}
}
