package arrays;

public class TrappingRainWater {
	public static void main(String[] args) {
		int a[]= {2,0,2,0,2,0,1};//1,5,3,1,2,8 //3,0,1,2,5
		int n=a.length;
		int rem=a[0];
		int curr;
		int curr0;
		for(int i=0;i<n;i++) {
			if(a[i]<rem) {
				rem=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			a[i]=a[i]-rem;
		}
		for (int i=0;i<n;i++) {
			if(a[i]>1) {
				curr=i;
			}
		}
		for (int i=1;i<n;i++) {
			if(a[i]==0) {
				curr0=i;
			}
		}
//		if(curr0>curr) {
//			
//		}
	}
}
//		int a[]= {2,0,2,0,2,0,1};//1,5,3,1,2,8 //3,0,1,2,5
//		int n=a.length;
////		int max=n-1;
//		int min;
//		int rem=a[0];
////		int flag=0;
//		int res=0;
//		int curr0=0;
//		int curr=0;
//		int count0=0;
//		for(int i=0;i<n;i++) {
//			if(a[i]<rem) {
//				rem=a[i];
//			}
//		}
//		for(int i=0;i<n;i++) {
//			a[i]=a[i]-rem;
//		}
//		for(int i=0;i<n;i++) {
//			if(a[i]!=0 && curr0!=0) {
//				rem=Math.min(a[curr], a[i]);
//				//res+=count0*Math.min(a[curr], a[i]);
//				//System.out.println(res);
//				for(int j=0;j<n;j++) {
//					a[j]=a[j]-rem;
//				}
//				//count0+=1;
//				min=Math.min(a[curr], a[i]);
//				if(min==a[curr] && min==a[i]) {
//					a[curr]=0;
//					a[i]=0;
//					curr=i+1;
//					count0=0;
//				}
//				else if(min==a[curr]) {
//					a[curr]=0;
//					a[i]=0;
//					curr=i;
//					count0=0;
//				}
//				else {
//					a[i]=0;
//					count0+=1;
//				}
//				
////				curr=i;
//			}
//			if(a[i]==0 && i!=0) {//&& curr!=-1
//				count0+=1;
//				curr0=i;
//			}
////			if(curr!=0) {
////				
////			}
//			for(int j=0;j<n;j++) {
//				System.out.print(a[j]+" ");
//			}
//			System.out.println();
//		}
//		for(int j=0;j<n;j++) {
//			res+=a[j];
//		}
//		System.out.println(res);
//	}