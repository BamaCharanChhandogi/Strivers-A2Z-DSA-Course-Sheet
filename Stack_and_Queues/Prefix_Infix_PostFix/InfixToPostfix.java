package Stack_and_Queues.Prefix_Infix_PostFix;

import java.util.Stack;

public class InfixToPostfix {
    public static int priority(char a) {
        if (a == '^') {
            return 3;
        } else if (a == '*' || a == '/') {
            return 2;
        } else if (a == '+' || a == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char currentChar = exp.charAt(i);
            if ((currentChar >= 'a' && currentChar <= 'z') ||
                (currentChar >= 'A' && currentChar <= 'Z') ||
                (currentChar >= '0' && currentChar <= '9')) {
                s.append(currentChar);
            } else if (currentChar == '(') {
                st.push(currentChar);
            } else if (currentChar == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    s.append(st.pop());
                }
                st.pop(); // Pop the '('
            } else {
                while (!st.isEmpty() && priority(currentChar) <= priority(st.peek())) {
                    s.append(st.pop());
                }
                st.push(currentChar);
            }
        }

        while (!st.isEmpty()) {
            s.append(st.pop());
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String expression = "a+b*c-d/e";
        System.out.println("Postfix expression: " + infixToPostfix(expression));
    }
}
