class Solution {
    public int minSteps(String s, String t) {
        Map <Character,Integer> map1=new HashMap<>();
        Map <Character,Integer> map2=new HashMap<>();
        char one,two;
        int count=0;
        for(int i=0;i<s.length();i++){
            one=s.charAt(i);
            two=t.charAt(i);
            map1.put(one,map1.getOrDefault(one,0)+1);
            map2.put(two,map2.getOrDefault(two,0)+1);
        }
        for(char c='a';c<='z';c++){
            if(map1.containsKey(c)&&map2.containsKey(c)){
                if(map1.get(c)==map2.get(c)){
                    map1.remove(c);
                    map2.remove(c);

                }
                else if(map1.get(c)>map2.get(c)){
                   map1.put(c,map1.get(c)-map2.get(c));
                   map2.put(c,0);
                }
                else{
                    map2.put(c,map2.get(c)-map1.get(c));
                    map1.put(c,0);
                    

                }
                
                
                
                
            }
        }
        for(Map.Entry<Character,Integer> set:map2.entrySet()){
            count+=set.getValue();

        }
        return count;
        
        
    }
}