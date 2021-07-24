package searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoPointerApproach {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int req = in.nextInt();
		System.out.println(usingHashmap(a,n,req));
		System.out.println(usingSort(a,n,req));
		
		in.close();
	}
	
	
	
	

	private static int usingHashmap(int[] a, int n, int req) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int count=0;
		for (int i=0;i<n;i++) {
			if(map.containsKey(req-a[i])) {
//				return a[i]+" "+(req-a[i]);
				count+=1;
			}
			else {
				map.put(a[i], req-a[i]);
			}
		}
		return count;
	}





	private static int usingSort(int[] a, int n, int req) {
		int i=0;
		int j=n-1;
		int count=0;
		Arrays.sort(a);
		while(i<j) {
			if(a[i]+a[j]==req) {
				count+=1;
//				if(a[i]==a[i+1])
//					count+=1;
					j--;
//				if(j!=0)
//					if(a[j]==a[j-1]) {
//					count+=1;
					i++;
//					}
				
//				return (a[i]+" "+a[j]);
			}
			else if(a[i]+a[j]>req) {
				j--;
			}
			else {
				i++;
			}
		}
		
		return count;
	}

}




/*
7
5 3 9 2 8 10 11
12

8
5 3 3 9 2 8 10 11
12


4
3 3 9 9
12
*/