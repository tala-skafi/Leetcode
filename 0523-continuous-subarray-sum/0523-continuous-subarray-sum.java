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
//         return false;
        //[[14,10],[10,8]]k=6
        //24-18=6
        

    Map<Integer,Integer> map = new HashMap();
    
    
    // this is for example (-10,10,5,4,... )
    // -10,10 add up to zero is a multiple of k.
    map.put(0,-1);
    
    int sum=0;
    for(int i =0;i<nums.length;i++){
        sum+=nums[i];
        int rem = sum%k;
        if(map.containsKey(rem) ){
            if((i-map.get(rem))>1)
                return true;
            else
                continue;
        }
                
        map.put(rem,i);
    }
    return false;

        
        
        
    }
}