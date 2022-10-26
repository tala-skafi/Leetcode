class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       //base case:
        if(nums.length<2)return false;
//         int len=nums.length;
//         int sum=0;
//         for (int i=0;i<len;i++){
//             sum=nums[i];
//             for(int j=i+1;j<len;j++){
//                 sum+=nums[j];
//                 if(sum%k==0)return true;
                
//             }
            
//         }

        for(int i=1;i<nums.length;i++) {
            if(nums[i] == 0 && nums[i-1] == 0) return true;
        }
        for(int i=1;i<nums.length;i++) {
            nums[i] += nums[i-1];
            if(nums[i] % k ==0) return true;
            int j = i;
            while(j> 1 && nums[i] > k) {
                if((nums[i] - nums[j-2]) % k ==0) {
                    return true;
                }
                j--;
            }
        }
        return false;
    }


        
        
        
    
}