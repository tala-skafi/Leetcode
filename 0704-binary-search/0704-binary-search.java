
class Solution {
    public int search(int[] nums, int target) {
        int hi=nums.length-1;
         int lo=0;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                lo=mid+1;
                
            }
            else hi=mid-1;
        }
        return -1;

        
        
    }
}


