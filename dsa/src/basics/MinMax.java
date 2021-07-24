package basics;
import java.util.*;
//import basics.A;
public class MinMax {
	int max(int arr[]) {
		int max=0;
		int n= arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println(arr[0]);
		//s.skip("[\r\n]+");
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		for(int i=0;i<n;i++)
		System.out.println("Value of "+i+":"+arr[i]);
		MinMax maxi=new MinMax();
		System.out.println(maxi.max(arr));
		A a=new A();
		System.out.println(a.fun());
		s.close();
	}

}

