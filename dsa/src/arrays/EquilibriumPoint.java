package arrays;

import java.util.Scanner;

public class EquilibriumPoint {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++) {
				a[i]=in.nextInt();
			}
			for(int i=1;i<n;i++) {
				a[i]=a[i-1]+a[i];
				System.out.println(a[i]);
			}
			if(a[0]==(a[n-1])) {
				System.out.println("Yes");
			}
			else {
				if(a[n-1]==(a[n-1])-a[n-2]) {
					System.out.println("Yes");
				}
			}
			for(int i=1;i<n-1;i++) {
				if(a[i-1]==(a[n-1]-a[i])) {
					System.out.println("Yes"+ " i:"+i);
					break;
				}
				
			}
			
			in.close();
		}
}



/*
6
3 4 8 -9 20 6

3
4 2 -2

3
1 2 1


*/