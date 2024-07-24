class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curList = new ArrayList<>();
        HashSet<Integer> selected = new HashSet<>();
        helper(ans, curList, nums, selected);
        return ans;
    }

    private void helper(List<List<Integer>> ans, ArrayList<Integer> curList, int[] nums, HashSet<Integer> selected) {
        if (curList.size() >= nums.length) {
            ans.add((ArrayList) curList.clone());
            return;
        }

        for (int num: nums) {
            if (!selected.contains(num)) {
                selected.add(num);
                curList.add(num);
                helper(ans, curList, nums, selected);
                selected.remove(num);
                curList.remove(curList.size() - 1);
            }
        }
    }
}