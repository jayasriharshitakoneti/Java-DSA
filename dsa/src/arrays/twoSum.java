import java.util.*; 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> pairs=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int check=target-nums[i];
            if(pairs.containsKey(check)){
                result[0]=pairs.get(check);
                result[1]=i;
                return result;
            }
            pairs.put(nums[i],i);

        }
        return result;
    }
}