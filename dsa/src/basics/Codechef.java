package basics;
import java.util.*;
//import java.lang.*;
//import java.io.*;
public class Codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		s.skip("[\r\n]+");
		for(int i=0;i<test;i++) {
			List<String> nums=Arrays.asList(s.nextLine().split(" "));
			long D=Long.parseLong(nums.get(0));
			long d=Long.parseLong(nums.get(1));
			long p=Long.parseLong(nums.get(2));
			long q=Long.parseLong(nums.get(3));
			long div=D/d;
			long ans=(D*p)+((((div-1)*(div))/2)*q*d)+((D%d)*(div*q));
			System.out.println(ans);
		}
		s.close();
	}
}