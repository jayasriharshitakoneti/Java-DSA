class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1)
            check=0;
            else{
                check++;
                if(check>max){
                    max=check;
                }
            }
        }
        return max;
    }
}