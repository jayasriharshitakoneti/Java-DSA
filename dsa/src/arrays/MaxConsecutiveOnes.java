package arrays;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int a[]= {1,0,1,1,0,1,1,1,0};
		int n=a.length;
		int count=0;
		int max=-1;
		for (int i=0;i<n;i++) {
			if(a[i]==1) {
				count+=1;
			}
			else {
				count=0;
			}
			if(count>max) {
				max=count;
			}
		}
		System.out.println(max);
	}

}
