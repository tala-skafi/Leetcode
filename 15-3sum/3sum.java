class Solution {
    List<List<Integer>> output;
    public List<List<Integer>> threeSum(int[] nums) {
        output=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)break;
           if(i>0 && nums[i]==nums[i-1])continue;
            System.out.println(nums[i]);
            find(-nums[i], i+1 , nums.length-1, nums);


        }
        return output;
        
    }
    private void find(int value, int i, int j, int [] nums){
        while(i<j){
            if(nums[i]+nums[j]>value)
            j--;
            else if(nums[i]+nums[j]<value)
            i++;
            else {
                   output.add(Arrays.asList(-value, nums[i], nums[j]));
                   while(i<nums.length-1&&nums[i]==nums[i+1])i++;
                    while(j>0&&nums[j]==nums[j-1])j--;
                    i++;
                    j--;
                
            }
        }
    }
}