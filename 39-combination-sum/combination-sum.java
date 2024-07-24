class Solution {
    List<List<Integer>> output;
    int targetSum;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        targetSum = target;
        output = new ArrayList<>();
        dfs(0, 0,  candidates, new ArrayList<>());
        return output;
    }

    public void dfs(int idx, int sum ,int[] cans, List<Integer> temp) {
        if (sum == targetSum) {
            output.add(new ArrayList<>(temp));
            return;
        }
        if (sum > targetSum || idx >= cans.length)
            return;
        temp.add(cans[idx]);
        dfs(idx,sum+cans[idx], cans, temp);
        temp.remove(temp.size() - 1);
        dfs(idx + 1,sum, cans, temp);

    }
}