package Stack_AND_Queues;

import java.util.LinkedList;

class MinStack {
    LinkedList<TplusMin> stack;

    private class TplusMin {
        int val;
        int min;

        public TplusMin(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int val) {
        int newMin;
        if (stack.isEmpty()) {
            newMin = val;
        } else {
            int currentMin = stack.getFirst().min;
            newMin = val < currentMin ? val : currentMin;
        }
        stack.addFirst(new TplusMin(val, newMin));
    }

    public void pop() {
        stack.removeFirst();
    }

    public int top() {
        return stack.peekFirst().val;
    }

    public int getMin() {
        return stack.peekFirst().min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        minStack.push(1);

        System.out.println("Top: " + minStack.top()); // Output: 1
        System.out.println("Min: " + minStack.getMin()); // Output: 1

        minStack.pop();
        System.out.println("Top after pop: " + minStack.top()); // Output: 8
        System.out.println("Min after pop: " + minStack.getMin()); // Output: 2
    }
}

