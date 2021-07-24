package arrays;

public class MaxSubArraySumNaive {
	public static void main(String[] args) {
		
		int sum=0;
		int a[]= {-5,4,99,100,-3,-4};//{-6,-1,-8};//2,3,-8,7,-1,2,3
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			sum=0;
			for (int j=i;j<a.length;j++) {
				sum+=a[j];
				System.out.print(a[j]+" ");
				if(sum>max) {
					max=sum;
				}
			}
			System.out.println();
		}
		System.out.println(max);
	}
}