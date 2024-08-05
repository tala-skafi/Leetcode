class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int level = 0;
        int index = 0;
        Queue<String> p = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        p.add(beginWord);
        while (!p.isEmpty()) {
            // 1.pop front
            String front = p.poll();
            // 2.check if goal
            if (front.equals(endWord)) {
                return level + 1;
            }
            // 3.check neighbours
            for (int i = 0; i < front.length(); i++) {
                char[] temp = front.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    temp[i] = c;
                    String t = new String(temp);
                    if (t.equals(beginWord)) {
                        continue;
                    }
                    if (set.contains(t))
                        q.add(t);
                    set.remove(t);

                }

            }
            // 4.check if level over
            if (p.isEmpty()) {
                level++;
                p = q;
                q = new LinkedList<>();
            }

        }

        return 0;

    }

    public boolean check(String current, String front) {
        int count = 0;
        for (int i = 0; i < current.length(); i++) {
            if (current.charAt(i) != front.charAt(i))
                count++;
        }
        return count == 1;
    }

}