class Solution {
    public int findMaxK(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)set.add(nums[i]);
            else break;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>0 && set.contains(-1*nums[i]))return nums[i];
            
        }
        return -1;
    }
}