import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo;

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        memo = new HashMap<>();
        return DFS(nums, 0);
    }

    private int DFS(int[] nums, int i) {
        if (i >= nums.length) return 0;
        if (memo.containsKey(i)) return memo.get(i);

        // Take the current house and move to i + 2
        int take = nums[i] + DFS(nums, i + 2);
        // Skip the current house and move to i + 1
        int skip = DFS(nums, i + 1);

        // Max value by either taking or skipping the current house
        int result = Math.max(take, skip);
        memo.put(i, result);  // Store the result in memo

        return result;
    }
}
