package arrays;

public class MaximumCircularSubArray {
	public static void main(String[] args) {
		int a[]= {-1,-2,-3,-4,-5,-6};// 5,-4,3,-5,3,4 //2,3,-8,7,-1,2,3; //{-5,1,-2,3,-1,2,-2};//{-5,1,-2,3,-1,2,-2};//{2,3,-8,7,-1,2,3};//{-6,-1,-8};//2,3,-8,7,-1,2,3// -5,1,-2,3,3,-1,2,-2
//		int max=a[0];
		int prev=a[0];
		int n=a.length;
		for(int i=1;i<n;i++) {
			prev+=a[i];
//			max=Math.max(max, prev);
		}
		int min=a[0];
		int next=a[0];
		for(int i=1;i<n;i++) {
			next=Math.min(a[i], next+a[i]);
			min=Math.min(min, next);
		}
		
		System.out.println(Math.max(prev-(min),prev));
		
//		System.out.println(max+" "+min);
	}
}



/// 10 5 -5       -5 10 5       5 -5 10


/// 4 5 -1 9   9 4 5 -1    5 -1 9 4  