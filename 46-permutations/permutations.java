class Solution {
    List<List<Integer>> out;
    List<Integer> temp;

    public List<List<Integer>> permute(int[] nums) {
        out = new ArrayList<>();
        temp = new ArrayList<>();
        dfs(nums, temp);
        return out;

    }

    public void dfs(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            out.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            dfs(nums,temp);
            temp.remove(temp.size()-1);
        }
    }
}