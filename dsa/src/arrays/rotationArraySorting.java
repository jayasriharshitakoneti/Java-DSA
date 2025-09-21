class Solution {
    public boolean check(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int least=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<=nums[i]){
                continue;
            }else{
                // largest=nums[i];
                if(nums[i]>least){
                    System.out.println(nums[i]);
                    return false;
                }
                for(int j=i+1;j<nums.length;j++){
                    System.out.println(nums[j]);
                    if(nums[j-1]>nums[j] || nums[j]>least){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}