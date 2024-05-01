class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word.length()){
            sb.append(word.charAt(i));
            if (word.charAt(i)==ch){
                i++;
                 sb.reverse();
                break;
            }
            i++;
        }
       
        while(i<word.length()){
            sb.append(word.charAt(i));

            i++;
        }
        return sb.toString();
        
    }
   
}