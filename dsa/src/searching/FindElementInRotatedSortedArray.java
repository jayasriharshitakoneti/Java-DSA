package searching;

import java.util.Scanner;

public class FindElementInRotatedSortedArray {

	static int index(int[] a, int n, int req) {
		int i=0,j=n-1;
		int mid=-1;
		if(req>=a[0]) {
			if(a[0]==req) {
				return 0;
			}
			while(i<=j) {
				mid=(i+j)/2;
				if(a[mid]==req) {
					return mid;
				}
				else if (req>a[mid]) {
					if(a[mid]<a[0]) {  // 10 11 12 13 15 21 22 1 3 4 7 8
						// 0:10 1:11 2:12 3:13 4:15 5:21 6:22 7:1 8:3 9:4 10:7 11:8
						j=mid-1;
					}
					else
						i=mid+1;
					
				}
				else {
					j=mid-1;
				}
				
			}
		}
		else {
			if(a[n-1]==req) {
				return n-1;
			}
			while(i<=j) {
				mid=(i+j)/2;
				if(a[mid]==req) {
					return mid;
				}
				else if (req<a[mid]) {//req>a[mid]
					if(a[mid]<a[n-1]) {
						j=mid-1;
					}
					else
						i=mid+1;
					
				}
				else {
					i=mid+1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int req = in.nextInt();
		System.out.println(index(a,n,req));
		in.close();
		
	}

}
