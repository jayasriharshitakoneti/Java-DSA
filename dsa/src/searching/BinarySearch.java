package searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		List<String> l =Arrays.asList(in.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		int n = in.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int req = in.nextInt();
		int i=0;
		int j=n-1;
		int flag=0;
		int mid=i;
		while(i<=j) {
			if(a[mid]==req) {
//				System.out.println("Found at: "+ mid);
				flag=1;
				if(mid>0 && a[mid]==a[mid-1])
				{
				j=mid-1;
				}
				else
				break;
			}
			else if(a[mid]<req) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
			mid=(i+j)/2;
		}
		if(flag==1) {
			System.out.println(mid);
		}
		
		i=0;
		j=n-1;
		mid=j;
		flag=0;
		
		while(i<=j) {
			if(a[mid]==req) {
//				System.out.println("Found at: "+ mid);
				flag=1;
				if(mid<n && a[mid]==a[mid+1])
				{
				i=mid+1;
				}
				else
				break;
			}
			else if(a[mid]<req) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
			mid=(i+j)/2;
		}
		if(flag==1) {
			System.out.println(mid);
		}
		
		
		in.close();
	}
}
