package arrays;

import java.util.Scanner;

public class SubArrayIntoThreeParts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]= new int[n];
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			sum+=a[i];
		}
		int curr=0;
		if(sum%3==0) {
			for(int i=0;i<n;i++) {
				curr+=a[i];
				if(curr==sum/3) {
					curr=0;
					count+=1;
				}
			}
		}
		if(count==3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		in.close();
	}
}

/*
3
1 1 1
 */