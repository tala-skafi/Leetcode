class Solution {
    public int characterReplacement(String str, int k) {
          int left=0,right=0;
      HashMap <Character,Integer> map=new HashMap<>();
      int maxMap=0,maxWin=0;
      while(right<str.length()){
          map.put(str.charAt(right),map.getOrDefault(str.charAt(right), 0) + 1);
          maxMap=Math.max(maxMap,map.get(str.charAt(right)));
          if((right-left+1)-maxMap>k){
              map.put(str.charAt(left),map.get(str.charAt(left))-1);
              left++;
          }
          maxWin=Math.max(maxWin,right-left+1);

          right ++;
      }
      return maxWin;
        
    }
}