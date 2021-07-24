package searching;

import java.util.Scanner;

public class OnesInSortedBinaryArray {

	static int oneCount(int a[],int n,int req) {
		int i=0;
		int j=n-1;
		int mid=j;
		if(a[n-1]==0) {
			return 0;
		}
		else if(a[0]==1) {
			return n;
		}
		else {
			while(i<=j) {
				if(a[mid]<req) {
					i=mid+1;
				}
				else if(a[mid]>req) {
					j=mid-1;
				}
				else {
					if(mid<=0 || a[mid]!=a[mid-1]) {
						return n-mid;
					}
					else {
						mid--;
					}
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int req = 1;
		
		System.out.println(oneCount(a,n,req));
		in.close();
	}

}
