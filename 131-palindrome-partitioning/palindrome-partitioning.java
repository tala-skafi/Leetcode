class Solution {
    List<List<String>> result;
    List<String> step;
    public List<List<String>> partition(String s) {
    result=new ArrayList<>();
    step=new ArrayList<>();

    helper(s);
      
    return result;
    }
    public void helper(String s) {
        // Base case
        if(s == null || s.length() == 0) {
            result.add(new ArrayList<>(step));
            return;
        }
        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue; // only do backtracking when current string is palindrome
            
            step.add(temp);  // choose
            helper(s.substring(i, s.length())); // explore
            step.remove(step.size() - 1); // unchoose
        }
        return;
    }
    public boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        return true;
    }
}