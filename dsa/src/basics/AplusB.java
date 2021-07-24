package basics;
import java.util.*;
public class AplusB {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		
		//Input : Abhishek:34848,Mayur:4739,Friends:2949,Yeah:9889
		//output :KueX
		
		String s = str.nextLine();
		s = s.replaceAll(",", " ");
		s = s.replaceAll(":", " ");
		
		List<String> arr = Arrays.asList(s.split(" "));
		
		List<String> arrStr = new ArrayList<String>();
		List<String> arrNum = new ArrayList<String>();
		
		for(int i=0;i<arr.size();i++){
			
			if((i+1)%2==0){
				arrNum.add(arr.get(i));
			}
		
			else{
				arrStr.add(arr.get(i));
			}
		}
		
		String result = "";
		
		for(int i=0;i<arrNum.size();i++){
			String k=arrNum.get(i);
			int maximum=0;
			
			for(int j=0;j<k.length();j++){
				String a = String.valueOf(k.charAt(j));
				
				if(Integer.parseInt(a)<=(arrStr.get(i)).length()){
					if(maximum<=Integer.parseInt(a)){
						maximum=Integer.parseInt(a);
					}
				}
			}
				
			if(maximum!=0){
				result+=(arrStr.get(i)).charAt(maximum-1);
			}
			
			else{
				result+="X";
			}

		}
		
		
		System.out.println("output : "+result);
		str.close();
	}
	
}