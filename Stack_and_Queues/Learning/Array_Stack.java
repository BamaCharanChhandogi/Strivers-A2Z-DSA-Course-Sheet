package Stack_and_Queues.Learning;


// Stack class.
public class Array_Stack {
    
    private int[] arr;
    private int size;
    private int topIndex;
    
    public Array_Stack(int capacity) {
        // Write your code here.
        this.arr = new int[capacity];
        this.topIndex = -1;
        this.size = capacity;
    }

    public void push(int num) {
        // Write your code here.
        if (topIndex != size - 1) {
            topIndex++;
            arr[topIndex] = num;
        }
    }

    public int pop() {
        // Write your code here.
        if (topIndex != -1) {
            int poppedValue = arr[topIndex];
            topIndex--;
            return poppedValue;
        } else {
            return -1;
        }
    }
    
    public int top() {
        // Write your code here.
        if (topIndex != -1) {
            return arr[topIndex];
        } else {
            return -1;
        }
    }
    
    public int isEmpty() {
        // Write your code here.
        if (topIndex == -1) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public int isFull() {
        // Write your code here.
        if (topIndex == size - 1) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Array_Stack stack = new Array_Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top of the stack: " + stack.top());
        System.out.println("Popped value: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}
