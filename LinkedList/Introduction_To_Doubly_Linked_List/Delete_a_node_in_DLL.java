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

public class Delete_a_node_in_DLL {
    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head==null ||head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.prev=arr;
        arr.next.next=new Node(3);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(4);
        arr.next.next.next.prev=arr.next.next;
        Node curr=deleteLastNode(arr);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
