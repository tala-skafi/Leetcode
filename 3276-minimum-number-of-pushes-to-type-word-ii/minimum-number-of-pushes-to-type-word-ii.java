class Solution {
    public int minimumPushes(String word) {
        int[] letterFrequency = new int[26];
        for (char c : word.toCharArray()) {
            letterFrequency[c - 'a']++;
        }

        Arrays.sort(letterFrequency);
        
        int totalPresses = 0;
        for (int i = 0; i < 26; i++) {

            totalPresses += (i / 8 + 1) * letterFrequency[26 - i - 1];
        }
        
        return totalPresses;
    }
}