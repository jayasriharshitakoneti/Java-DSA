package searching;

import java.util.Scanner;

public class RootOfANumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i=0;
		int j=n/2;
		int mid=n/2;
		int count=0;
		while(i<=j) {
			System.out.println(mid+" "+(++count));
			if(mid*mid>n) {
				j=mid-1;
			}
			else if(mid*mid<n) {
				i=mid+1;
			}
			else {
				break;
			}
			mid=(i+j)/2;
		}
		System.out.println(mid);
		in.close();
		
	}

}
