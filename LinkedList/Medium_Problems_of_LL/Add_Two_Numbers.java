class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newLL = new ListNode(-1);
        ListNode temp = newLL;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            temp.next=new ListNode(sum%10);
            temp=temp.next;
            carry=sum/10;
        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        newLL=newLL.next;
        return newLL; 
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        //second LinkedList
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(3);
        headB.next.next.next = new ListNode(4);
        headB.next.next.next.next = new ListNode(5);

        System.out.println();

        ListNode ans=addTwoNumbers(headA,headB);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
