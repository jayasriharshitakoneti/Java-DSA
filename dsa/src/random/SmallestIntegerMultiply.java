package random;

import java.util.Scanner;

public class SmallestIntegerMultiply {
	
	static int fun(int a) {
		if(a<10) {
			return 10+a;
		}
		String s="";
		int i=9;
		while(a!=0 && i>1) {
			if(a%i==0) {
				String sample="";
				 while(a!=0){
					if(a%i!=0) {
						s=sample+s;
						break;
					}
					sample=i+sample;
					a=a/i;
				}
			}
			i-=1;
		}
		if(a==1) {
			return Integer.parseInt(s);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		System.out.println(fun(a));
		in.close();
	}
}
