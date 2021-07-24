package arrays;

public class SlidingWindowNonNegativeUnsorted {
	public static void main(String[] args) {
		int a[]= {1};
		int n= a.length;
		int sum=a[0];
		int given=1;
		int start=0;
		int end=1;
		while(end<n && start<=end) {
			System.out.println(sum);
			if(sum==given) {
				break;
			}
			
			if(sum>given) {
				sum-=a[start];
				start++;
			}
			else {
				sum+=a[end];
				end++;
			}
		}
		if(sum==given)
		System.out.println("Yes"+" Start: "+(1+start)+" End: "+(end));
		else
		System.out.println("No");
	}
}
