package searching;

import java.util.*;

public class RepeatingElement {
	
	//0 1 2 3 3 3
	public static int repeatingElement(int[] a, int n) {
		int ans=0;
		int given=0;
		int max=a[0];
		for (int i=0;i<n;i++) {
			given+=a[i];
			if(max<a[i]) {
				max=a[i];
			}
		}
		int sum=(max*(max+1)/2);
		given=given-sum;
		if(given==0) {
			if(n>1) {
				return 0;
			}
			else {
				return -1;
			}
		}
		ans=given/(n-max-1);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println(repeatingElement(a,n));
		in.close();
	}

}
