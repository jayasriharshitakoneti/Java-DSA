package recursion;
import java.util.*;
public class OneToN {
	
	static void ntoone(long n) {
		if(n==0) {
			return;
		}
		System.out.print(n+" ");
		ntoone(n-1);
	
	}
	
	static void oneton(long n) {
		if(n==0) {
			return;
		}
		oneton(n-1);
		System.out.print(n+" ");
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	long n = in.nextLong();
	//in.skip("\\n");
	oneton(n);
	System.out.println();
	ntoone(n);
	in.close();
}
}
