class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slength=s.length();
        int tlength=t.length();
        if(slength!=tlength) return false;
        HashMap<Character,Character> map=new HashMap<>();
        int[] frq=new int[128];
        for(int i=0;i<slength;i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                if(frq[t.charAt(i)]!=0) return false;
                map.put(s.charAt(i),t.charAt(i));
                frq[t.charAt(i)]++;
            }
        }
        return true;
    }
}