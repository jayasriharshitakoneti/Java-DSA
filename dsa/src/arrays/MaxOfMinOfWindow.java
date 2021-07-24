package arrays;

import java.util.Scanner;

public class MaxOfMinOfWindow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int min;
		int max_min=a[0];
		
		int k=in.nextInt();
//		int num=n-(n%k);
		min = a[0];
		for(int i=0;i<k;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		max_min=min;
//			if(n%k!=0) {
//			min=a[n-(n%k)];
		for(int i=k;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(max_min<min) {
				max_min=min;
			}
		}
//			}
		System.out.println(max_min);
		in.close();
	}
}
