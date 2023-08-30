package LinkedList.Medium_Problems_of_DLL;

import java.util.ArrayList;

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

public class Find_pairs_with_given_sum_in_doubly_linked_list {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node tail=head;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(tail.next!=null){
            tail=tail.next;
        }
        while(head!=tail){
            if(head.data+tail.data==target){
                ArrayList<Integer> tem=new ArrayList<>();
                tem.add(head.data);
                tem.add(tail.data);
                ans.add(tem);
                head=head.next;
                
            }
            else if(head.data+tail.data>target){
                tail=tail.prev;
            }
            else{
                head=head.next;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Node arr=new Node(2);
        arr.next=new Node(3);
        arr.next.prev=arr;
        arr.next.next=new Node(3);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(4);
        arr.next.next.next.prev=arr.next.next;
        int k=6;
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
         answer=findPairsWithGivenSum(k,arr);
         System.out.println(answer);
    }
}

