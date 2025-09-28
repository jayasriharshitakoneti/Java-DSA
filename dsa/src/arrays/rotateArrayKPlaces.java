class Solution {

    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        int n[]= new int[nums.length];
        int first_nums=nums.length-k;

        if(nums.length==1 || k==0)
        return;

        for(int i=0;i<first_nums/2;i++){
            int temp=nums[i];
            nums[i]=nums[first_nums-i-1];
            nums[first_nums-i-1]=temp;
        }

        for(int i=0;i<k/2;i++){
            int temp=nums[first_nums+i];
            nums[first_nums+i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }


        for(int i=0;i<nums.length/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }

        System.out.println();
    }

}