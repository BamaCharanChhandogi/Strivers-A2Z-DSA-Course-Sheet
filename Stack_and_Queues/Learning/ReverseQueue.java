import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    // Method to reverse the queue
    public static Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();
        while (q.size() > 0) {
            s.push(q.poll());
        }
        while (s.size() > 0) {
            q.offer(s.pop());
        }
        return q;
    }

    // Main method
    public static void main(String[] args) {
        // Create a queue and add some elements
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println("Original Queue: " + q);

        // Reverse the queue
        q = rev(q);

        System.out.println("Reversed Queue: " + q);
    }
}
