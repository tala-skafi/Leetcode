class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> myMap=new HashMap<Character,Character>();
        myMap.put('(',')');
        myMap.put('{','}');
        myMap.put('[',']');
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(myMap.containsKey(s.charAt(i)))
                stack.push(s.charAt(i));
                else{
                    if(stack.isEmpty())
                        return false;
                    char open=stack.pop();
                    if(myMap.get(open)!=s.charAt(i))
                        return false;
                }
        }
        return stack.isEmpty();
        
        
        
    }
}