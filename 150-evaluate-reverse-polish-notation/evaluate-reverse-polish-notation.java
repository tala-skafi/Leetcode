class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int op1, op2;
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                op2 = stack.pop();
                op1 = stack.pop();
                switch (token) {
                    case "-":
                        stack.push(op1 - op2);
                        break;
                    case "+":
                         stack.push(op1 + op2);
                         break;
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                       stack.push(op1 / op2);
                       break;

                }
            }

        }
        return stack.peek();

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