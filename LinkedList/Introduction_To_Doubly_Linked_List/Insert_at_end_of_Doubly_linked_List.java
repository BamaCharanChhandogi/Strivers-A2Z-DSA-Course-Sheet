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

public class Insert_at_end_of_Doubly_linked_List {
    public static Node insertAtTail(Node list, int K) {
        // Write your code here
        Node curr=list;
        while(curr.next!=null) {
            curr=curr.next;
        }
        Node newNode=new Node(K);
        curr.next=newNode;
        newNode.prev=curr;
        return list;
    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.next=new Node(3);
        arr.next.next.next=new Node(4);
        int K=5;
        Node curr=insertAtTail(arr,K);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
