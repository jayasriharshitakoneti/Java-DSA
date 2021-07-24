package arrays;

public class MaxLengthEvenOddSubArray {
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,7,10};//1,1,2,3,4,5,6,6
		int count=0;
		int odd=0;
		int even=0;
		int max=0;
		if(a.length>0) {
			if(a[0]%2==0) {
				odd=0;
				even=1;
			}
			else {
				even=0;
				odd=1;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 ) {
				if(odd==1) {
					count+=1;
					odd=0;
					even=1;
					}
				else {
					even=1;
					count=1;
				}
			}
			else if(a[i]%2!=0) {
				if(even==1) {
					count+=1;
					even=0;
					odd=1;	
				}
				else {
					odd=1;
					count=1;
				}
			}
			max=Math.max(max, count);
		}
		System.out.println(max);
	}
}
