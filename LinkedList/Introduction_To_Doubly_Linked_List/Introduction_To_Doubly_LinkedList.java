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

public class Introduction_To_Doubly_LinkedList {
    public static Node constructDLL(int []arr) {
        // Write your code here
        if(arr==null|| arr.length==0) return null;

        Node newNode = new Node(arr[0]);
        Node head=newNode;
        for(int i=1; i<arr.length; i++){
            Node n=new Node(arr[i]);
            head.next=n;
            n.prev=head;
            head=n;
        }
        return newNode;
    }
    public static void main(String[] args) {
        int arr[]={1,3,32,5};
        Node curr=constructDLL(arr);
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

    }
}
