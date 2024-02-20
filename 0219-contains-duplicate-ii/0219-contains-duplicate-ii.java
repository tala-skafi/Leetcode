class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))map.put(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
	        for(int i=0;i<entry.getValue().size()-1;i++){
                if(entry.getValue().get(i+1)-entry.getValue().get(i)<=k)return true;
                
                
            }
}
        return false;
        
    }
}