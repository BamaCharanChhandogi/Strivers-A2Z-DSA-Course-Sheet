class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Find_the_intersection_point_ofY_LL {
    public static int Length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA=headA;
        ListNode currB=headB;

        int headALength=Length(headA);
        int headBLength=Length(headB);
        int diff=Math.abs(headALength-headBLength);
        if(headALength<headBLength){
            for(int i=0;i<diff;i++){
                currB=currB.next;
            }
        }
        else{
            for(int i=0;i<diff;i++){
                currA=currA.next;
            }
        }

        while(currA!=currB){
            currA=currA.next;
            currB=currB.next;
        }
        return currA;
        
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(0);
        headA.next.next = new ListNode(4);
        headA.next.next.next = new ListNode(2);
        headA.next.next.next.next = new ListNode(2);
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(5);
        headB.next.next.next = headA.next.next;
        headB.next.next.next.next = headA.next.next.next;
        headB.next.next.next.next.next = headA.next.next.next.next;
        ListNode ans=getIntersectionNode(headA,headB);
        System.out.println(ans.val);

    }
}
