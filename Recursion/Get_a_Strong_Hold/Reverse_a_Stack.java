package Recursion.Get_a_Strong_Hold;

import java.util.Stack;

public class Reverse_a_Stack {
    public static void reverseStack(Stack<Integer> s,int val) {
        if(s.size()==0){
            s.push(val);
            return;
        }
        int temp=s.pop();
        reverseStack(s, val);
        s.push(temp);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int val=s.pop();
        reverse(s);
        reverseStack(s,val);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(12);
        stack.add(2);
        stack.add(43);
        stack.add(765);
        System.out.println("Original stack is: "+stack);
        reverse(stack);
        System.out.println("Reverse stack is: "+stack);
    }
}