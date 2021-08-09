package arrays;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
//		for(int i=)
		int a[]= {4,3,3,3};
		int y[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]%a[j]==0 || a[j]%a[i]==0 ){
					y[i]+=1;
				}
			}
		}
//		for(int i =0 ;i<n;i+=1) {
//			System.out.println(y[i]);
//		}
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for (int i=0;i<n;i++) {
			if(y[i]>second) {
				if(y[i]>=first) {
					second=first;
					first=y[i];
				}
				else {
					second=y[i];
				}
			}
		}
//		System.out.println(first+" "+second);
		if(first>second) {
			System.out.println(first-second);
		}
		else {
			System.out.println(first);
		}
	}
}