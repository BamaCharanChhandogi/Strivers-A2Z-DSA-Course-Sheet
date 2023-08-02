package Strings.Basic_and_Easy_String_Problems;

import java.util.Stack;

public class Remove_outermost_Paranthesis {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(stack.size()>0){
                    ans+=s.charAt(i);
                }
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(stack.size()>0){
                    ans+=s.charAt(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="(())";
        System.out.println(removeOuterParentheses(s));
    }
}
