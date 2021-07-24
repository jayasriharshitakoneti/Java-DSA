package arrays;

import java.util.ArrayList;
import java.util.Collections;


public class StockBuySell {
	
	
	static void fun(ArrayList<ArrayList<Integer>> reqXY,int a[],int n){
		int max=n-1;
		int min=n-1;
		int flag=0;
		int res=0;
		int req=0;
		for(int i=n-1;i>-1;i--) {
			if(a[min]>=a[i]) {
				min=i;
				flag=1;
			}

//			if(a[max]<=a[i]) {
//				max=i;
//			}
			
			if(a[min]<a[i]){
				if(min!=max && a[min]!=a[max]) {
				    ArrayList<Integer> reqq= new ArrayList<>();
					req=a[max]-a[min];
					reqq.add(min);
					reqq.add(max);
					reqXY.add(reqq);//Arrays.asList(min,max)
				}
				res+=a[max]-a[min];
				flag=0;
				max=min-1;
				min=max;
			}
		}
		if(flag==1){
		ArrayList<Integer> reqq= new ArrayList<>();
		reqq.add(min);
		reqq.add(max);
		reqXY.add(reqq);}

    }
    
    static void stockBuySell(int A[], int n) {

        ArrayList<ArrayList<Integer>> reqXY=new ArrayList<>();
        fun(reqXY,A,n);
        Collections.reverse(reqXY);
        for(int i=0;i<reqXY.size();i++) {
        	System.out.print(reqXY.get(i));
        }
        
    }
	
	
	public static void main(String[] args) {
		int a[]={100,180,260,310,310,310,40,535,695};//{11, 42, 49, 96, 23, 20, 49, 26, 26, 18, 73, 2, 53,59, 34, 99, 25,2};//{100,180,260,310,310,310,40,535,695};//1,5,3,1,2,8
//		Collections.toList(a)
		//List.of(a);
		
		
//		Set<Integer> difference = new HashSet<Integer>((List<Integer>)List.of(a).stream().map(e->Integer.parseInt(e)));
		
		int n=a.length;
		stockBuySell(a,n);
//		int max=n-1;
//		int min=n-1;
//		int flag=0;
//		int res=0;
//		int req=0;
//		for(int i=n-1;i>-1;i--) {
//			if(a[min]>a[i]) {
//				min=i;
//				flag=1;
//			}
//
//			if(a[min]<a[i]){
//				if(req<a[max]-a[min]) {
//					req=a[max]-a[min];
//					System.out.println("max: "+max+" min: "+min );
//				}
//				res+=a[max]-a[min];
//				flag=0;
//				max=min-1;
//				min=max;
//			}
//		}
//		if(flag==1)
//		res+=a[max]-a[min];
//		System.out.println(req);
//	
		}

}
