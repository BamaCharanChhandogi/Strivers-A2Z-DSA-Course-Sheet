package LinkedList.Introduction_To_Doubly_Linked_List;

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev =null;
        this.next = null;
    }
}

public class Reverse_LinkedList {
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head==null || head.next==null)
            return head;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.prev=arr;
        arr.next.next=new Node(3);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(4);
        arr.next.next.next.prev=arr.next.next;
        Node curr=reverseDLL(arr);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
