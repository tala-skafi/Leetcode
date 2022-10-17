class Solution {
    public boolean checkIfPangram(String sentence) {
        int len=sentence.length();
       HashSet<Character> set=new HashSet<>();
        if(len<26)return false;
        
        int counter=0;
        for(int i=0;i<len;i++){
            char c=sentence.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                counter++;
                if(counter==26)return true;
            }
           
        }
           return false;
          
    }
}