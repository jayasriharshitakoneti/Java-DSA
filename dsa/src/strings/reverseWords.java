class Solution {
    public String reverseWords(String s) {
        String curr="";
        String result="";

        for(char c:s.toCharArray()){
            if(c!=' '){
                curr+=c;
            }else{
                if(curr!=" " && curr!=""){
                    result=curr+" "+result;
                }
                curr="";
            }
        }
        return (curr+" "+result).strip();
    }
}