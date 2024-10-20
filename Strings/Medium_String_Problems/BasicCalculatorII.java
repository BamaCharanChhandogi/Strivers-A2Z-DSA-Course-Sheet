import java.util.Stack;

public class BasicCalculatorII {

    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int currentNum = 0;
        char lastOperator = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }
            
            if ((!Character.isDigit(c) && !Character.isWhitespace(c)) || i == s.length() - 1) {
                if (lastOperator == '+') {
                    st.push(currentNum);
                } else if (lastOperator == '-') {
                    st.push(-currentNum);
                } else if (lastOperator == '*') {
                    int top = st.pop();
                    st.push(top * currentNum);
                } else if (lastOperator == '/') {
                    int top = st.pop();
                    st.push(top / currentNum);
                }
                lastOperator = c;
                currentNum = 0;
            }
        }
        
        int result = 0;
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s)); 
    }
}
