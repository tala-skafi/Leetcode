class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> storage = new HashSet<>();
        for (int num: nums) {
            storage.add(num);
        }
        int sequenceMax = 0;
        for (int num: nums) {
            if (!storage.contains(num - 1)) {
                int sequenceCount = 1;
                while (storage.contains(num + sequenceCount)) {
                    sequenceCount++;
                }
                sequenceMax = Math.max(sequenceCount, sequenceMax);
            }
            if(sequenceMax > nums.length/2) break;
        }
        return sequenceMax;
    }
}