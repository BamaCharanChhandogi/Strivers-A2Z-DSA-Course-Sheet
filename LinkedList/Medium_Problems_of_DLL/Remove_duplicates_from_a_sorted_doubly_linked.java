package LinkedList.Medium_Problems_of_DLL;

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

public class Remove_duplicates_from_a_sorted_doubly_linked {
   public static Node removeDuplicates(Node head) {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            Node next = curr.next;
            
            if (prev.data == curr.data) {
                prev.next = next;
                if (next != null) {
                    next.prev = prev;
                }
            } 
            else {
                prev = curr;
            }
            
            curr = next;
        }

        return head;
    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.prev=arr;
        arr.next.next=new Node(2);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(3);
        arr.next.next.next.prev=arr.next.next;

        Node answer=removeDuplicates(arr);
        while(answer!=null){
            System.out.println(answer.data);
            answer=answer.next;
        }

    }
}