

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Linked_List_Cycle2 {
    public static ListNode hasCycle(ListNode head) {
        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                turtle=head;
                while(hare!=turtle){
                hare=hare.next;
                turtle=turtle.next;
            }
            return turtle;
        }
    }
    return null;
    }
    //getIndex
    public static int getIndex(ListNode head, ListNode target) {
        int index = 0;
        ListNode current = head;
        while (current != target) {
            current = current.next;
            index++;
        }
        return index-1;
    }
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next.next=head.next.next.next;

        ListNode ans=hasCycle(head);
            int cycleStartIndex = getIndex(head, ans);
            System.out.println("The cycle starts at index: " + cycleStartIndex);
    }
}


