package basics;
import java.util.*;
public class TwoOddsInList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr=new int[n];
		int ans=0;
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			if(i==0) {
				ans=arr[0];
			}
			else {
				System.out.println(ans);
			 ans^=arr[i];
			 }
		}
		
		int num1=0,num2=0;
		int check= ans&(~(ans-1));
		System.out.println(ans+" "+check);
		for(int i=0;i<n;i++) {
			if((arr[i] & check)==check) {
				num1^=arr[i];
			}
			else {
				num2^=arr[i];
			}
		}
		System.out.println(num1+" "+num2);
		in.close();
	}
}
