import java.lang.Math;
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<k)
           k= k%nums.length;
        int limit=nums.length-k;
        int index=0;
        int temp;
        int[] result=new int[nums.length];
        
          for(int i=nums.length-1;i>=0;i--){
            if(i>=limit){
                 index=i-limit;
                 result[index]=nums[i];    
            }
            else{
                    index=k+i;
                     result[index]=nums[i];
            }
            
        }
        for(int i=0;i<result.length;i++){
             nums[i]= result[i];
        }
            
        
       

        
    }
}