package recursion;

import java.util.Scanner;

public class RopeCuttingProblem {
	
	static int rope(int n,int a,int b,int c) {
		int max1=0,max2=0;
		
		if(n%a==0 || n%b==0 || n%c==0) {//rope(n,a,b,c)
			int one=-2,two=-2,three=-2;
			if(n%a==0)
				one=(int)(n/a);
			
			if(n%a==0)
				two=(int)(n/a);
			
			if(n%b==0)
				three=(int)(n/b);

			int arr[]= {one,two,three};
			int max=arr[0];
			for(int i=0;i<3;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			max1=max;
			
		}

		if(n%a==b || n%a==c || n%b==a || n%b==c || n%c==b || n%c==a) {
			//return Math.max(a, b);
			int one=-2,two=-2,three=-2,four=-2,five=-2,six=-2;
			if(n%a==b)
				one=(int)(n/a)+(int)(n-a)/b;
			
			if(n%a==c)
				two=(int)(n/a)+(int)(n-a)/c;
			
			if(n%b==a)
				three=(int)(n/b)+(int)(n-b)/a;
			
			if(n%b==c)
				four=(int)(n/b)+(int)(n-a)/c;
			
			if(n%c==b)
				five=(int)(n/c)+(int)(n-c)/b;
			
			if(n%c==a)
				six=(int)(n/c)+(int)(n-c)/a;
//			System.out.println(one);
			
			int arr[]= {one,two,three,four,five,six};
			int max=arr[0];
			for(int i=0;i<6;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			max2=max;
		}
		if(max1!=0 || max2!=0)
			return Math.max(max2, max1);
		else
		return -1;
		
		//return true;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int n=s.nextInt();
		int arr[]=new int[4];
		for(int i=0;i<4;i++)
			arr[i]=s.nextInt();
		//s.skip("\\n");
		//if(rope(arr[0]%arr[1],arr[1],arr[2],arr[3]));
		//if(rope(arr[0]%arr[2],arr[1],arr[2],arr[3]));
		//if(rope(arr[0]%arr[3],arr[1],arr[2],arr[3]));
		System.out.println(rope(arr[0],arr[1],arr[2],arr[3]));
		s.close();
	}
}
