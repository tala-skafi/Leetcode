class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        int op1, op2;
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                op2 = stack.pop();
                op1 = stack.pop();
                if (token.equals("-")) 
                    stack.push(op1 - op2);
            
                else if (token.equals("+")) 
                         stack.push(op1 + op2);
        
                else if (token.equals("*")) 
                        stack.push(op1 * op2);
    
                else if (token.equals("/")) 
                       stack.push(op1 / op2);

                }
            }

        
        return stack.pop();

    }

    public boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}