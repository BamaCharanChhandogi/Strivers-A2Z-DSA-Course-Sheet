class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Sort_a_linked_list_of_0s_1s_and_2s {
    public static ListNode sortList(ListNode head) {
        // Write your code here
        ListNode ZeroNode=new ListNode(0);
        ListNode OneNode=new ListNode(0);
        ListNode TwoNode=new ListNode(0);
        ListNode t1=ZeroNode;
        ListNode t2=OneNode;
        ListNode t3=TwoNode;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==0){
                ListNode a = new ListNode(curr.val);
                t1.next=a;
                t1=a;
                curr=curr.next;
            }
            else if(curr.val==1){
                ListNode b = new ListNode(curr.val);
                t2.next=b;
                t2=b;
                curr=curr.next;
            }
            else{
                ListNode c = new ListNode(curr.val);
                t3.next=c;
                t3=c;
                curr=curr.next;
            }
        }
        ZeroNode=ZeroNode.next;
        OneNode=OneNode.next;
        TwoNode=TwoNode.next;
        if(ZeroNode == null && OneNode == null) return TwoNode;
        if(ZeroNode == null){
            t2.next = TwoNode;
            return OneNode;
        }
        if(OneNode == null){
            t1.next = TwoNode;
            return ZeroNode;
        }
        if(TwoNode == null){
            t1.next = OneNode;
            return ZeroNode;
        }
        t1.next=OneNode;
        t2.next=TwoNode;
        return ZeroNode;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        ListNode ans=sortList(head);
        ListNode current = ans;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
