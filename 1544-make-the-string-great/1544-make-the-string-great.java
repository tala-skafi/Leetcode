class Solution {
    public String makeGood(String s) {
        int i=0;
        int len=s.length();
        StringBuilder sb = new StringBuilder();
        if (len==1)return s;
        
        char []arr=s.toCharArray();
        while(i<len-1){
            if(Math.abs(arr[i]-arr[i+1])==32){
                i+=2;
                if(i==len-1){
                     if(sb.length()==0)sb.append(arr[i]);
                else if(Math.abs(sb.charAt(sb.length()-1)-arr[i])!=32)sb.append(arr[i]);
                 else sb.deleteCharAt(sb.length()-1) ;
                }
               
            }
            // else if (){}
            else{
                if(sb.length()==0)sb.append(arr[i]);
                 else if(Math.abs(sb.charAt(sb.length()-1)-arr[i])!=32)sb.append(arr[i]);
                 else sb.deleteCharAt(sb.length()-1) ;
                 i++;
                if(i==len-1){
                     if(sb.length()==0)sb.append(arr[i]);
                else if(Math.abs(sb.charAt(sb.length()-1)-arr[i])!=32)sb.append(arr[i]);
                 else sb.deleteCharAt(sb.length()-1) ;
                }
            }
             
           
            
        }
        return sb.toString();
        
       
    }
}