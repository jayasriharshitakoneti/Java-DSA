package recursion;

import java.util.Scanner;

public class Palindrome {
	
	static long modpower(int n,int p,int m){
        if(p==1){
            return n;
        }
        else if(p%2==0){
            long pow=(modpower(n,p/2,m))%m;//*modpower(n,p/2,m)
            return ((pow*pow)%1000000007);
        }
        else{
            return ((n*(modpower(n,p-1,m))%1000000007)%1000000007);
        }
    }

//	static long power(int n, int p) {
//		if (p == 0 && n == 0) {
//			return 1;
//		}
//		if (p == 1) {
//			return n;
//		}
//		return ((n * (power(n, p - 1))) % 1000000007);
//	}

//	static long power(int n, int p) {
//		if(p<=1) {
//			return 1;
//		}
//		//System.out.println((n*(power(n,p-1)))%1000000007);
//		return (long) ((n*(power(n,p-1)))%1000000007);
////		return 1;
//	}

	static int reverse(int val, int n) {
		if (n < 10) {
			return val + n;
		}
		val += (n % 10);
		return (reverse(val * 10, (int) (n / 10)));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(reverse(0, n));
		System.out.println(modpower(n, reverse(0, n),1000000007));
		in.close();
	}
}
