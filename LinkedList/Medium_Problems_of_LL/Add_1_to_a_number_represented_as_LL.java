class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Add_1_to_a_number_represented_as_LL {
    public static ListNode Reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
        public static ListNode addOne(ListNode head) 
        { 
            //code here.
            ListNode reversed=Reverse(head);
            int carry=1;
            ListNode curr=reversed;
            while(curr!=null){
                int sum=curr.val+carry;
                curr.val=sum%10;
                carry=sum/10;
                curr=curr.next;
            }
            ListNode result = Reverse(reversed);
        
        // Step 4: If carry is left, create a new ListNode
        if (carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = result;
            result = newHead;
        }
            return result;
        }
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(6);
        head.next.next = new ListNode(8);
        head.next.next.next = new ListNode(9);
        head.next.next.next.next = new ListNode(2);
        ListNode ans=addOne(head);
        ListNode current = ans;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
