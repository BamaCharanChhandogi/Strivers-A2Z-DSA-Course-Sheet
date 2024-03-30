package Stack_and_Queues.Prefix_Infix_PostFix;

import java.util.Stack;

public class Prefix_to_Infix {
    public static String prefixToInfixConversion(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                String str = "(";
                str += st.pop();
                str += s.charAt(i);
                str += st.pop();
                str += ")";
                st.push(str);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String prefixExpression = "+AB-*CD";
        System.out.println("Infix Expression: " + prefixToInfixConversion(prefixExpression));
    }
}

