class Solution {
    public int minSteps(String s, String t) {
        int[] map = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            map[c1 - 'a']--;
            map[c2 - 'a']++;
        }
        
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                res += map[i]*1;
            }
        }
        
        return res;
    }
}