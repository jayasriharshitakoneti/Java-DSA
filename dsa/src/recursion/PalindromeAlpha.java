package recursion;

import java.util.Scanner;

public class PalindromeAlpha {
	
	static boolean reverse(String s,int start,int end) {
		if(s.length()==1 || s.length()==0) {
			return true;
		}
		
		if(s.charAt(start)!=(s.charAt(end))) {
			return false;
		}
		else {
			
		if(end>start) {
			return true;
		}
//		else if(start>(int)((s.length())/2)) {
//			return false;
//		}
		return reverse(s,start+1,end-1);
		}
//		if()
//		return false;
		
		
//		if(len==-1) {
//			return res;
//		}
//		res+=s.charAt(len);
//		return reverse(s,len-1,res);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(reverse(s,0,s.length()-1));
//		System.out.println(s.equals(reverse(s,0,s.length()-1)));
		scan.close();
	}
}
