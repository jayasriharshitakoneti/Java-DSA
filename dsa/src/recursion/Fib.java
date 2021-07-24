package recursion;

import java.util.Scanner;

public class Fib {
	static int fibonacci(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	fibonacci(n);
	in.close();
}
}
