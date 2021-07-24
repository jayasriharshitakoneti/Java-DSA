package arrays;

import java.util.Scanner;

public class PrefixSumQueries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int pref[]=new int[n];
		pref[0]=a[0];
		int q=in.nextInt();
		for(int i=1;i<n;i++) {
			pref[i]=pref[i-1]+a[i];
		}
		for (int i=0;i<q;i++) {
			int l=in.nextInt();
			int r=in.nextInt();
			System.out.println(pref[r]-pref[l]);
		}
		in.close();
	}
}