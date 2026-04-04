class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        int[] check_count=new int[26];
        Map<String,Integer> first_occur=new HashMap<>();
        int unique_counter=0;

        for(int i=0;i<strs.length;i++){
            temp = new ArrayList<>();
            check_count=new int[26];
            String temp_code="";

            for(int j=0;j<strs[i].length();j++){
                check_count[strs[i].charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++){
                if(check_count[j]!=0){
                temp_code+=check_count[j]+""+((char)'a'+j); 
                System.out.println(temp_code);
                }
            }
            if(!first_occur.containsKey(temp_code)){
                first_occur.put(temp_code,unique_counter);
                unique_counter++;
                temp.add(strs[i]);
                result.add(temp);
            }else{
                result.get(first_occur.get(temp_code)).add(strs[i]);
            }
        }
        return result;
    }
}