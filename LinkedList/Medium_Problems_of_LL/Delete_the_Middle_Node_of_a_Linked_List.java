class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class  Delete_the_Middle_Node_of_a_Linked_List {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0, head);
      ListNode hare = dummy;
        ListNode turtle = dummy;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        turtle.next = turtle.next.next;
        return dummy.next;
    }
        
    

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        int n=2;
        ListNode ans=deleteMiddle(head);
        ListNode current = ans;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
