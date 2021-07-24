package searching;

import java.util.HashMap;
import java.util.Scanner;

public class TwoPointerDifference {

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

	private static String usingHashmap(int[] a, int n, int req) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i=0;i<n;i++) {
			if(map.containsKey((int)Math.abs(a[i]-req))) {
				return a[i]+" "+(a[i]-req);
			}
			else {
				map.put( a[i],(int)Math.abs(a[i]-req));
			}
		}
		return "No";
	}

	private static String usingSort(int[] a, int n, int req) {
		
		return null;
	}

}


/*
7
3 5 9 2 8 10 11
2


7
5 3 9 2 8 10 11
2


*/
