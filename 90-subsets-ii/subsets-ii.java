class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result=new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<>());
        return result;

        
        
    }
    public void generateSubsets(int[] nums, int idx, List<Integer> temp){
        result.add(new ArrayList<>(temp));
        for(int i=idx; i<nums.length; i++){
            if( i > idx && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            generateSubsets(nums,i+1,temp);
            temp.remove(temp.size()-1);

        }
    }
}