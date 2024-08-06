import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> memo;

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        memo = new HashMap<>();
        int robFirst=DFS(nums, 0, nums.length - 2);
        memo = new HashMap<>();
        int robSec=DFS(nums, 1, nums.length - 1);
        return Math.max(robFirst, robSec);
    }

    private int DFS(int[] nums, int i, int end) {
        if (i > end) return 0;
        if (memo.containsKey(i)) return memo.get(i);
        int take = nums[i] + DFS(nums, i + 2, end);
        int skip = DFS(nums, i + 1, end);
        int result = Math.max(take, skip);
        memo.put(i, result);

        return result;
    }
}
