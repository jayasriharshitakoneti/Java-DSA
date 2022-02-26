package basics;

import java.util.Scanner;

public class JpmcDecoding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int i = scan.nextInt();
		double d = scan.nextDouble();
		
		System.out.printf("String: %s\n", s);
		System.out.printf("Double: %f\n", d);
		System.out.printf("Integer: %f\n", i);
		scan.close();
	}
}
