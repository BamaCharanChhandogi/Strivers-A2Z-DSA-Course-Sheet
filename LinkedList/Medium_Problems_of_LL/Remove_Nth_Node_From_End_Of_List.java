class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Remove_Nth_Node_From_End_Of_List {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        
        int indexToSearch = size-n;
        ListNode prev = head;
        int i=1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n=2;
        ListNode ans=removeNthFromEnd(head,n);
        ListNode current = ans;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
