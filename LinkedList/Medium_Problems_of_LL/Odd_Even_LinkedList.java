class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Odd_Even_LinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddCurrent = oddHead;
        ListNode evenCurrent = evenHead;
        
        while (evenCurrent != null && evenCurrent.next != null) {
            oddCurrent.next = evenCurrent.next;
            oddCurrent = oddCurrent.next;
            evenCurrent.next = oddCurrent.next;
            evenCurrent = evenCurrent.next;
        }
        oddCurrent.next = evenHead;
        return oddHead;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        System.out.println();

        ListNode ans=oddEvenList(headA);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
