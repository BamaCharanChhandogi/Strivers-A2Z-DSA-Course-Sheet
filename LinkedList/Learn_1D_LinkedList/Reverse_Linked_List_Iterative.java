package LinkedList.Learn_1D_LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Reverse_Linked_List_Iterative {
    public static ListNode reverseList(ListNode head) {
        //test case
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next; 
        }
        head.next=null;
        head=prev;
        return prev;

    }
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        ListNode ans=reverseList(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
