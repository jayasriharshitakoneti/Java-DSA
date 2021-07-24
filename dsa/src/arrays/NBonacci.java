package arrays;
import java.util.*;
public class NBonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a[]=new int[m];
		for(int i=0;i<n-1;i++) {
			a[i]=0;
			System.out.println(a[i]);
		}
		a[n-1]=1;
		System.out.println(a[n-1]);
		int sum=1;
		for(int i=n;i<m;i++) {
			a[i]=sum;
			sum+=(a[i]-a[i-n]);
			System.out.println(a[i]);
		}
		in.close();
	}
}
