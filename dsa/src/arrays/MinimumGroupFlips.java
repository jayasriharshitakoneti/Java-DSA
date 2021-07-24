package arrays;
import java.util.*;
public class MinimumGroupFlips {
	public static void main(String[] args) {
		int a[]= {1,1,1};//{1,1,1};{1,0,0,0,1,0,0,1,1,1,1};//{1,0,0,1,0,1,0,1,0};
		int count1=1,count0=1;
		int firstind=0,lastind=0;
		Set<List<Integer>> setones=new LinkedHashSet<>();
		Set<List<Integer>> setzeros=new LinkedHashSet<>();
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[firstind]) {
				if(a[i]==1) {
					count1+=1;
//					count0=1;
					lastind=i;
				}
				else {
					count0+=1;
					lastind=i;
//					count1=1;
				}
			}
			else {
				if(a[i]==0) {
					List<Integer> req=new ArrayList<Integer>();
					req.add(firstind);
					req.add(lastind);
					setones.add(req);
					firstind=lastind+1;
					lastind=firstind;
					count1=1;
				}
				else {
					List<Integer> req=new ArrayList<Integer>();
					req.add(firstind);
					req.add(lastind);
					setzeros.add(req);
					firstind=lastind+1;//firstind+count0
					lastind=firstind;
					count0=1;
				}
			}
		}
		
		if(a[a.length-1]==1) {
			List<Integer> req=new ArrayList<Integer>();
			req.add(firstind);
			req.add(lastind);
			setones.add(req);
			firstind=lastind+1;
			lastind=firstind;
			count1=1;
		}
		else {
			List<Integer> reqq=new ArrayList<Integer>();
			reqq.add(firstind);
			reqq.add(lastind);
			setzeros.add(reqq);
			firstind=lastind+1;//firstind+count0
			lastind=firstind;
			count0=1;
		}
		int result=Math.min(setones.size(), setzeros.size());
		System.out.println(result);
		
		if(setones.size()>setzeros.size()) {
			Iterator<List<Integer>> it=setzeros.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		else {
			Iterator<List<Integer>> it=setones.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
//		System.out.println(setones);
//		System.out.println(setzeros);
	}
}
