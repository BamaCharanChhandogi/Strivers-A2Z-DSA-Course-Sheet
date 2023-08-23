package LinkedList.Hard_Problems_of_LL;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Reverse_Nodes_in_k_Group {
    public static ListNode reverseK(ListNode head,int length,int k){
    if(length<k){
        return head;
    }
    int count=0;
    ListNode prev=null;
    ListNode curr=head;
    ListNode Next=null;
    while(curr.next!=null && count<k){
         Next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=Next;
        count++;
    }
    while(Next!=null){
        head.next=reverseK(head,length-k,k);
    }
    return prev;
}
    public int count(ListNode head){
        int length=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            length++;
        }
        return length;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=count(head);
        ListNode ans=reverseK(head,length,k);
        return ans;
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

        int k=4;
        int length=5;
        current=reverseK(head,length,k);

        // Print the modified linked list after deletion
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
