package LinkedList.Hard_Problems_of_LL;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        int count=1;
        while (curr.next!= null){
            curr=curr.next;
            count++;
        }
        k=k%count;
        int bakilength=count-k-1;
        ListNode prev=head;
        while(bakilength>0){
            prev=prev.next;
            bakilength--;
        }
        curr.next=head;
        head=prev.next;
        prev.next=null;
        return head;
  }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        int k=1;
        current=rotateRight(head,k);

        // Print the modified linked list after deletion
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
