class Solution {
    public boolean canJump(int[] nums) {
        int len=nums.length;
        int goal=nums[len-1];
        for(int i=len-1;i>=0;i--){
            if(nums[i]+i>=goal){
                goal=i;
            }
        }
        if(goal>0)return false;
        else return true;
        
    }
}