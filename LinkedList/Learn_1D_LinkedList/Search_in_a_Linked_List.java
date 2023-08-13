package LinkedList.Learn_1D_LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Search_in_a_Linked_List {
    public static int searchInLinkedList(ListNode head, int k)
    {
        // Write Your Code Here.
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==k){
                return 1;
            }
            curr=curr.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        System.out.println(searchInLinkedList(head, 43));
    }
}


