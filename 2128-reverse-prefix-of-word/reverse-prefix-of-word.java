class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int flag=0;
        while(i<word.length()){
            sb.append(word.charAt(i));
            if (word.charAt(i)==ch && flag==0){
                 sb.reverse();
                 flag=1;
            }
            i++;
        }
        return sb.toString();
        
    }
   
}