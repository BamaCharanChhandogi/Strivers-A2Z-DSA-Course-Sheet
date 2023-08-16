

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Find_length_of_Loop {
    public static int lengthOfLoop(ListNode head) {
        // Write your code here
        ListNode hare = head;
        ListNode turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                hare = head;
                while (hare != turtle) {
                    hare = hare.next;
                    turtle = turtle.next;
                }
                hare = turtle;
                int count = 0;
                while (hare != null) {
                    count++;
                    hare = hare.next;
                    if (hare == turtle) {
                        return count;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;

        System.out.println(lengthOfLoop(head));
    }
}
