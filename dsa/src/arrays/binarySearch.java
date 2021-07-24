package arrays;

public class binarySearch {
	public static void main(String[] args) {
		int[] a= {0,1,2,3,4};
		int i=0;
		int flag=0;
		int num=5;
		int j=a.length-1;
		int mid;
		//int mid=a.length/2;
		while(i<=j) {
			mid=(i+j)/2;
			if(a[mid]==num) {
				flag=1;
				System.out.println("Yes");
				break;
			}
			else if(a[mid]<num) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
			
		}
		if(flag==0) {
			System.out.println("No");
		}
	}
}
