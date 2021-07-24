//package arrays;
//
//public class ReverseArrayInGroups {
//
//	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
//        ArrayList<Integer> dup = new ArrayList<>();
//        int num=n-(n%k);
//        for(int i=0;i<num;i+=k){
//            for(int j=0;j<k;j++){
//                if((i+k-j-1)!=num)
//                dup.add(arr.get(i+k-j-1));
//            }
//        }
//        if(num!=n){
//        for(int j=0;j<k;j++){
//                dup.add(arr.get(n-j-2));
//        }
//        }
//         for (int i = 0; i < dup.size();i++) 
//	      { 		      
//	          arr.set(i,dup.get(i)); 		
//	      }
//    }
//	
//	
//}
