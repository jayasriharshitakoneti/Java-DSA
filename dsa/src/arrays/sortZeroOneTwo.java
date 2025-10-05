class Solution {
    public void sortColors(int[] nums) {
        int two=nums.length-1;
        int zero=0;

        int i=0;
        while(two>=i && two>=zero){
            if(nums[i]==0){
                int temp=nums[zero];
                nums[zero]=nums[i];
                nums[i]=temp;
                zero++;
            } else if(nums[i]==2){
                int temp=nums[two];
                nums[two]=nums[i];
                nums[i]=temp;
                two--;
                if(temp==0 || temp==2){
                    i--;
                }
            } 
            i++;
        }
    }
}