class Solution {
        public int singleNumber(int[] nums) {
         Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l-1;i+=2){
            if(nums[i]!=nums[i+1])
                return nums[i];          
            
          
        }
     return nums[l-1];
    }
}