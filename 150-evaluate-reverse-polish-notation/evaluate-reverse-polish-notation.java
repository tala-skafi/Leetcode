import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();
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
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumeric(String str) {
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(solution.evalRPN(tokens)); // Output: 9

        // Test with larger input
        String[] largeTokens = {"2", "3", "+", "4", "*", "5", "-"};
        System.out.println(solution.evalRPN(largeTokens)); // Output: 15
    }
}
