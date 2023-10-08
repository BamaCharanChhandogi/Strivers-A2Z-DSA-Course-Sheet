package Stack_AND_Queues;


class MyStack 
{
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode newnode=new StackNode(a);
        // Add your code here
        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
        top=newnode;
        }
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top==null){
            return -1;
        }
        
        int ans=top.data;
        top=top.next;
        return ans;
        
    }
    // Function to check if the stack is empty.
    boolean isEmpty() {
        return top==null;
    }

    // Function to get the top element of the stack without removing it.
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an empty stack.
        }
        return top.data;
    }
}
public class Implement_Stack_using_Linked_List {
    public static void main(String[] args) {
        MyStack stack =new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}
