package Recursion.Get_a_Strong_Hold;

import java.util.Stack;

public class Sort_a_stack {
    public static void sorting(Stack<Integer> s,int temp){
        if(s.isEmpty()||s.peek()<temp){
            s.push(temp);
            return;
        }
        int val=s.pop();
        sorting(s,temp);
        s.push(val);
        
    }
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.isEmpty()){
		    return s;
		}
		    int temp=s.pop();
		    sort(s);
		    sorting(s,temp);
		    return s;
		
		
	}
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(12);
        stack.add(2);
        stack.add(43);
        stack.add(765);

        sort(stack);
        System.out.println(stack);
    }
}
