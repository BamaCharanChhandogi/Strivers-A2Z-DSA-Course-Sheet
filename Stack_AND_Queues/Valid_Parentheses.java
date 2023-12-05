

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        int length=s.length();
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<length;i++){
            if(ans.isEmpty()){
                ans.push(s.charAt(i));
            }
            else if((ans.peek()=='(' && s.charAt(i)==')') || (ans.peek()=='{' && s.charAt(i)=='}') || (ans.peek()=='[' && s.charAt(i)==']')){
                ans.pop();

            }
            else{
                ans.push(s.charAt(i));
            }
        }
        if(ans.size()==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
    }
}
