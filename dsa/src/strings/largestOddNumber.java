class Solution {
    public String largestOddNumber(String num) {
        int last_index=-1;
        for(int i=num.length()-1;i>-1;i--){
            if(num.charAt(i)=='1' || 
            num.charAt(i)=='3' || num.charAt(i)=='5' || 
            num.charAt(i)=='7' || num.charAt(i)=='9'){
                last_index=i;
                break;
            }
        }
        String result="";
        for(int i=0; i<=last_index;i++){
            result+=num.charAt(i);
        }
        return result;
    }
}