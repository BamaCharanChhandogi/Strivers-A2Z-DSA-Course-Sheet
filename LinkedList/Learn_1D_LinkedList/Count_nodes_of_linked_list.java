package LinkedList.Learn_1D_LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Count_nodes_of_linked_list {
    public static int length(ListNode head){
        //Your code goes here
        int count=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        return count;
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

        System.out.println(length(head));
    }
}

