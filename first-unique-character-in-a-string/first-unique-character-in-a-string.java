class Solution {
    public int firstUniqChar(String s) {
        
        char[] arr = s.toCharArray();
        int len = arr.length;
        
    
        int[] fre = new int[26];
        for(char c : arr) fre[c-'a']++;
        
     
        for(int i=0; i<len; i++) if(fre[arr[i]-'a'] == 1) return i;
        return -1;
    }
}