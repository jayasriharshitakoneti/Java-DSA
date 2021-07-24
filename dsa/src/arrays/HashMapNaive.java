package arrays;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class HashMapNaive {
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,2,2};
		Map<Integer,Integer> nums = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			if(nums.containsKey(arr[i])) {
				Integer count = nums.get(arr[i]);
				nums.put(arr[i], count+1);
			}
			else
			nums.put(arr[i], 1);
		}
		int req=-1;
		//Map.Entry<Integer, Integer> vals : nums.entrySet()
		for(int vals:nums.keySet()) {
			//System.out.println(vals);
			if(nums.get(vals)>arr.length/2) {
				req=vals;
			}
		}
		if(req==-1) {
			System.out.println("Not Possible");
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==req) {
				System.out.println(i);
				//break;
				}
			}
		}
	}
}