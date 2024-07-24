class Solution {
    int total = 0;

    public int subsetXORSum(int[] nums) {
        helper(nums, 0, 0);
        return total;
    }

    public void helper(int[] nums, int idx, int currentXOR) {
        total += currentXOR;
        for (int i = idx; i < nums.length; i++) {
            helper(nums, i + 1, currentXOR ^ nums[i]);
        }
    }
}
