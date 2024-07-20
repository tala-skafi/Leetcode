class Solution {
    public int maxAscendingSum(int[] nums) {
        int right=1, max=nums[0] ,sum=nums[0];
        while(right<nums.length){
            if(nums[right]<=nums[right-1]){       
                sum=nums[right];
 
            } 
            else{
                sum+=nums[right];   
            }
            max=Math.max(max,sum);
            right++;

        }
        return max;
        
    }
}