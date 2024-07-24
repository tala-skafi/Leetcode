import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> output;
    int targetSum;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort to facilitate skipping duplicates
        targetSum = target;
        output = new ArrayList<>();
        dfs(0, 0, candidates, new ArrayList<>());
        return output;
    }

    public void dfs(int idx, int sum, int[] cans, List<Integer> temp) {  
        if (sum == targetSum) {
            output.add(new ArrayList<>(temp));
            return;
        }
        if (sum > targetSum || idx >= cans.length) {
            return;
        }

        for (int i = idx; i < cans.length; i++) {
            // Skip duplicates
            if (i > idx && cans[i] == cans[i - 1]) {
                continue;
            }
            temp.add(cans[i]);
            dfs(i + 1, sum + cans[i], cans, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
