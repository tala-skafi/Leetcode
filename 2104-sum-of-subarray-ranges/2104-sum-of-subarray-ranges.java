class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long answer = 0;
        
        for (int i = 0; i < n; ++i) {
            int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
            for (int j = i; j < n; ++j) {
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                answer += maxVal - minVal;
            }
        }
        return answer;
    }
}