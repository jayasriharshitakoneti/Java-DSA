package arrays;

public class SlidingWindow {
	public static void main(String[] args) {
		int a[]= {1,8,30,-5,20,7};
		int n= a.length;
		int sum=0;
		int k=3;
		int given=45;
		int max;
		int flag=0;
		for(int j=0;j<k;j++) {
			sum+=a[j];
		}
		if(sum==given) {
			flag=1;
		}
		max=sum;
		for (int i=k;i<n;i++) {
			sum+=(a[i]-a[i-k]);
			if(sum==given) {
				flag=1;
				max=sum;
				break;
			}
			max=Math.max(max, sum);
		}
		if(flag==1)
			System.out.println("Yes");
		System.out.println(max);
	}
}
