class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,List<Integer>> map_with_freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max=Math.max(max, entry.getValue());
            if(map_with_freq.containsKey(entry.getValue())){
                map_with_freq.get(entry.getValue()).add(entry.getKey());
            }else{
                List<Integer> temp= new ArrayList<>();
                temp.add(entry.getKey());
                map_with_freq.put(entry.getValue(), temp);
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for(int i=max;i>0;i--){
            if(map_with_freq.containsKey(i)){
                for (int j=0;j<map_with_freq.get(i).size();j++) {
                    result[--k]=map_with_freq.get(i).get(j);
                } if(k==0){
                    break; 
                }
            }
        }
        return result;
    }
}