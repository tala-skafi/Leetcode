class Solution {
    public int minSubArrayLen(int S, int[] arr) {
           int left=0,right=0;
    int min=Integer.MAX_VALUE;
    int sum=0;
    //7, [2, 1, 5, 2, 8]
    while(right<=arr.length){
      if(sum>=S){
        min=Math.min(min,right-left);
        sum-=arr[left];
        left++;

      }
      else{
        if(right<arr.length){
          sum+=arr[right];
          right++;
        }
        else break;
        
      }

    }
    return min == Integer.MAX_VALUE ? 0 : min; 
    }
}