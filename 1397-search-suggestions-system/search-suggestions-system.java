import java.util.*;

class Solution {
    private Node root;

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        root = new Node('\0');
        for (String s : products) {
            insert(s);
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < searchWord.length(); i++) {
            prefix.append(searchWord.charAt(i));
            List<String> suggestions = getAllPossibles(prefix.toString());
            result.add(suggestions);
        }
        return result;
    }

    private void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) curr.children[c - 'a'] = new Node(c);
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    private List<String> getAllPossibles(String prefix) {
        List<String> res = new ArrayList<>();
        Node curr = root;
        for (char c : prefix.toCharArray()) {
            if (curr.children[c - 'a'] == null) return res;
            curr = curr.children[c - 'a'];
        }
        collectSuggestions(curr, res, prefix);
        return res;
    }

    private void collectSuggestions(Node node, List<String> suggestions, String prefix) {
        if (suggestions.size() >= 3) return;
        if (node.isWord) suggestions.add(prefix);
        for (char c = 'a'; c <= 'z'; c++) {
            if (node.children[c - 'a'] != null) {
                collectSuggestions(node.children[c - 'a'], suggestions, prefix + c);
            }
        }
    }

    class Node {
        public char c;
        public boolean isWord;
        public Node[] children;

        public Node(char c) {
            this.c = c;
            isWord = false;
            children = new Node[26];
        }
    }
}
