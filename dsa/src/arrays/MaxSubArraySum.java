package arrays;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int a[]= {2,3,-8,7,-1,2,3};//{-5,1,-2,3,-1,2,-2};//{-5,1,-2,3,-1,2,-2};//{2,3,-8,7,-1,2,3};//{-6,-1,-8};//2,3,-8,7,-1,2,3// -5,1,-2,3,3,-1,2,-2
		int max=a[0];
		int prev=a[0];
		int n=a.length;
		for(int i=1;i<n;i++) {
			prev=Math.max(a[i], prev+a[i]);
			max=Math.max(max, prev);
		}
		System.out.println(max);
	}
}

//if(sum<a[i] && sum+a[i]<a[i]) {
//	sum=a[i];
//}
//else if(sum+a[i]>sum) {
//	sum=sum+a[i];
////	max=sum;
//}
//else {
//	sum=sum+1-1;
//}



//else {
//	pass;
//	//sum=sum;
//}
//sum=Math.max(sum, i)
//if(sum>max) {
//	max=sum;
//}





//	int prefsum[]=new int[a.length];
//	for (int i=0;i<a.length;i++) {
//		sum+=a[i];
//		prefsum[i]=sum;
////		System.out.println(sum+" "+max);
////		if(sum>max) {
////			max=sum;
////		}
//	}
////	for(int i=0;i<a.length;i++) {
////		System.out.print(prefsum[i]+" ");
////	}
//	//System.out.println(sum);
//	int neg=0;
//	sum=0;
//	int preffsum[]=new int[a.length];
//	for (int i=0;i<a.length;i++) {
//		sum+=prefsum[i];
//		preffsum[i]=sum;
////		System.out.println(sum+" "+max);
////		if(sum>max) {
////			max=sum;
////		}
//	}
//	for(int i=0;i<a.length;i++) {
//	System.out.print(preffsum[i]+" ");
//}
//	for(int i=0;i<a.length;i++) {
//		if(prefsum[i]<0) {
//			neg+=prefsum[i];
//		}
//		if((prefsum[i]+(-1*neg))>max) {
//			//System.out.println(sum+(-1*neg)+" neg "+ neg+" sum "+prefsum[i]+" i "+i);
//			max=prefsum[i]+(-1*neg);
//		}
////		System.out.print(prefsum[i]+" ");
//	}
////	System.out.println();
////	System.out.println(max);
//}