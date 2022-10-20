class Solution {
   public void sortColors(int[] nums) {
        // code
        int h=nums.length-1, l=0, i=0;
        while(i<=h){
          if(nums[i]==0){
           swap(i,l,nums);
           i++;
           l++;
        }
        else if(nums[i]==1){
        i++;
        }
        else if(nums[i]==2){
        swap(i,h,nums);
        h--;
        //i++;
        }

        }

            }
        public void swap(int one, int two, int [] nums){
            
                int temp;
             temp=nums[one];
                 nums[one]=nums[two];
                nums[two]=temp;
        }
        }
 
