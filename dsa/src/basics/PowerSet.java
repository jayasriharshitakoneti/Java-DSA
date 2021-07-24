package basics;
import java.util.*;
public class PowerSet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
//		in.skip("\r\n");
		in.close();
		for(int i=0;i<(Math.pow(2,str.length()));i++) {
		for(int j=0;j<str.length();j++) {
			if((i&(1<<j))!=0) {
				System.out.print(str.charAt(j));
			}
		}
		System.out.println();
		}
	}
}
