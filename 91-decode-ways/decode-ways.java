class Solution {
    int count;
    int [] map;
    public int numDecodings(String s) {
        map=new int[s.length()];
        if(s.equals("0"))return 0;
        count=0;
        helper(0,s);
        return count;
        
        
    }
    public void helper(int idx, String s){
        if(idx==s.length()){
            count++;
            return;
        }
        if(s.charAt(idx)=='0')return;
        if(map[idx]!=0){
            count+=map[idx];
            return;
        }
        helper(idx+1,s);
        if(idx<s.length()-1 && ( s.charAt(idx)=='1'   ||  s.charAt(idx)=='2'&& s.charAt(idx+1)<'7'))
        helper(idx+2,s);
        map[idx]=count;



    }
}