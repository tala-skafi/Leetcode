class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);

        int res = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                int temp = 1;

                while(set.contains(curr+1)){
                    // set.remove(curr+1);
                    curr++;
                    temp++;
                }
                res = Math.max(res, temp);
            }
        }
        return res;
    }
}