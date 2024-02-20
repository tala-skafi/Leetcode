import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();

        if (words.length != chars.length) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (set.contains(word)) {
                    return false;
                }
                map.put(c, word);
                set.add(word);
            }
        }

        return true;
    }
}