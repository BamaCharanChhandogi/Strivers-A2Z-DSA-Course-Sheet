package Stack_and_Queues.Learning;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }
    
    public void pop() {
        if (min.peek().equals(st.peek())) {
            min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(-3);
        obj.push(2);
        obj.push(1);
        obj.push(4);
        obj.push(6);
        obj.pop();
        System.out.println(obj.getMin());
    }
}

