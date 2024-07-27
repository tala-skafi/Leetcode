class WordDictionary {
    Node root;

    public WordDictionary() {
        root=new Node('\0');

    }

    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(curr.children[c-'a']==null)curr.children[c-'a']=new Node(c);
            curr=curr.children[c-'a']; 
        }
        curr.isWord=true;


    }

    public boolean search(String word) {
        Node curr=root;
        return helper(word,curr);
        
    }
    private boolean helper(String word,Node curr){
         if (word.isEmpty()) {
            return curr.isWord;
        }

        char c = word.charAt(0);
        
        if (c == '.') {
            for (Node child : curr.children) {
                if (child != null && helper(word.substring(1), child)) {
                    return true;
                }
            }
            return false;
        }
            else if (curr.children[c - 'a'] == null)
                return false;
            
            else {
                curr=curr.children[c - 'a'];
                return helper(word.substring(1), curr );
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

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */