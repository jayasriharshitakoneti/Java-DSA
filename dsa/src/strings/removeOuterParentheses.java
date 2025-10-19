class Solution {
    public String removeOuterParentheses(String s) {
        String new_string="";
        int count_left=0;
        int count_right=0;
        for(int i=0;i<s.length();i++){
            if(count_left==count_right){
                count_left=0;
                count_right=0;
            }
            if(s.charAt(i)=='('){
                count_left++;
                if(count_left-count_right!=1){
                    new_string+=s.charAt(i);
                }
            }else{
                count_right++;
                if(!(count_left-count_right==0)){
                    new_string+=s.charAt(i);
                }
            }
        }
        return new_string;
    }
}