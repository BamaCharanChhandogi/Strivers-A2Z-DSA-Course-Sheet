package LinkedList.Learn_1D_LinkedList;

public class IntroductiontoLinkedList {
   public static class Node {
        public int data;
        public Node next;
   
        Node()
        {
            this.data = 0;
            this.next = null;
        }
   
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
   
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };
    // function
    public static Node constructLL(int []arr) {
        // Write your code here
        Node head=new Node(0);
        Node curr=head;
        for(int i=0;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            curr.next=newNode;
            curr=curr.next;
        }
        return head.next;
    }
   
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node ans=constructLL(arr);
        System.out.println(ans.data);

    }
}
