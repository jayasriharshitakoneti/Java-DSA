class Solution {
    public int reverseBits(int n) {
        int result=0;
        int i=1;
        while(i<32){
            result=result<<1;

            if(n%2==1){
                result+=2;
            }
            n=n>>1;
            i++;
        }
        return result;
    }
}