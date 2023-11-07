package Stack_AND_Queues;

class MyStack {
    int top;
    int arr[] = new int[1000];

    MyStack() {
        top = -1;
    }

    // Function to push an integer into the stack.
    void push(int a) {
        // Check if the stack is full before pushing.
        if (top == arr.length - 1) {
            System.out.println("Stack is full. Cannot push " + a);
            return;
        }
        top++;
        arr[top] = a;
    }

    // Function to remove an item from the top of the stack.
    int pop() {
        // Check if the stack is empty before popping.
        if (top <= -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate an empty stack.
        }
        int a = arr[top];
        top--;
        return a;
    }

    // Function to check if the stack is empty.
    boolean isEmpty() {
        return top == -1;
    }

    // Function to get the top element of the stack without removing it.
    int peek() {
        if (top <= -1) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack.
        }
        return arr[top];
    }

    // Function to get the size of the stack.
    int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}

