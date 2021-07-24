package basics;
import java.util.Scanner;
public class chef13_1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int N= in.nextInt();
	int ans=1;
	for(int i=2;i<=10;i++) {
		if(N%i==0) {
			ans=i;
		}
	}
	System.out.println(ans);
	in.close();
}
}
