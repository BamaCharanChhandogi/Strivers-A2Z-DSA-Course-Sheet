package Stack_and_Queues.Prefix_Infix_PostFix;

import java.util.Stack;

public class PostFix_To_Infix {
    public static String postfixToInfix(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String str = "";
                String s1 = st.pop();
                String s2 = st.pop();
                str += "(" + s2 + s.charAt(i) + s1 + ")";
                st.push(str);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String postfixExpression = "AB+CD-*";
        System.out.println("Infix Expression: " + postfixToInfix(postfixExpression));
    }
}

