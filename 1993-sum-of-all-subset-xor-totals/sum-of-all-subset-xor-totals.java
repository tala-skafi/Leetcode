class Solution {
    int total = 0;

    public int subsetXORSum(int[] nums) {
        helper(nums, 0, 0);
        return total;
    }

    public void helper(int[] nums, int idx, int currentXOR) {
        if (idx == nums.length) {
            total += currentXOR;
            return;
        }
        helper(nums, idx + 1, currentXOR ^ nums[idx]);
        helper(nums, idx + 1, currentXOR);
    }
}
