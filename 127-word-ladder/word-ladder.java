

class Solution {
    static class Pair {
        String s;
        int seqLen;

        Pair(String s, int seqLen) {
            this.s = s;
            this.seqLen = seqLen;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> list = new HashSet<>(wordList);

        if (!list.contains(endWord)) {
            return 0;
        }

        q.add(new Pair(beginWord, 1));

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            if (curr.s.equals(endWord)) {
                return curr.seqLen;
            }

            for (int i = 0; i < curr.s.length(); i++) {
                char[] charArray = curr.s.toCharArray();

                for (char j = 'a'; j <= 'z'; j++) {
                    charArray[i] = j;
                    String f = new String(charArray);

                    if (f.equals(beginWord)) {
                        continue;
                    }

                    if (list.contains(f)) {
                        q.add(new Pair(f, curr.seqLen + 1));
                        list.remove(f);
                    }
                }
            }
        }
        return 0;
    }
}