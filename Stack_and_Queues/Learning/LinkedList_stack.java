package Stack_and_Queues.Learning;

class Node {
    int data;
    Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Stack {
    Node head;
    int size;

    Stack() {
        head = null;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        }
        temp.next = head;
        size++;
        head = temp;
    }

    void pop() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    int getTop() {
        if (head == null) {
            return -1; // Or you can throw an exception indicating stack underflow
        }
        return head.data;
    }
}

public class LinkedList_stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getTop());
        stack.pop();
        System.out.println(stack.getTop());
        stack.pop();
        System.out.println(stack.getTop());
        stack.pop();
        System.out.println(stack.getTop());
    }
}
