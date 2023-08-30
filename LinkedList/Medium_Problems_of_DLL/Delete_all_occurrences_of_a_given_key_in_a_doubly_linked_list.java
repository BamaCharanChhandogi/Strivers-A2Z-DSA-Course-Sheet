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

public class Delete_all_occurrences_of_a_given_key_in_a_doubly_linked_list {
    public static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp.prev==null && temp.next==null){
                    return null;
                }
                else if(temp.prev==null){
                    temp=temp.next;
                    head=temp;
                    temp.prev=null;
                }
                else if(temp.next==null){
                    temp.prev.next=null;
                    temp=temp.next;
                }
                else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    temp=temp.next;
                }
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.prev=arr;
        arr.next.next=new Node(3);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(2);
        arr.next.next.next.prev=arr.next.next;
        int k=2;
        Node answer=deleteAllOccurOfX(arr,k);
        while(answer!=null){
            System.out.println(answer.data);
            answer=answer.next;
        }

    }
}

