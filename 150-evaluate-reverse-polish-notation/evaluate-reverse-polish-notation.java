class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int op1, op2;
        for (String token : tokens) {
            if (token.equals("-")) {
                int sub = stack.pop();
                stack.push(stack.pop() - sub);
            } else if (token.equals("+"))
                stack.push(stack.pop() + stack.pop());

            else if (token.equals("*"))
                stack.push(stack.pop() * stack.pop());

            else if (token.equals("/")) {
                int div = stack.pop();
                stack.push(stack.pop() / div);
            } else {
                stack.push(Integer.parseInt(token));
            }

        }

        return stack.pop();

    }

}