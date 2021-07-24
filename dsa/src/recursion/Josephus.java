package recursion;
import java.util.*;
public class Josephus {
	
	static int jos(int n,int k,int curr,int list[],int count) {
		if(count==0) {
			for(int val:list) {
				if(val!=-1) {
					return val;
				}
			}
//			return list[0];
		}
		list[curr]=-1;
		count-=1;
		return jos(n,k,(curr+k)%(n),list,count);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i;
		}
		System.out.println(jos(n,k,(k-1)%n,arr,(n-1)));
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		in.close();
	}

}