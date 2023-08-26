package LinkedList.Introduction_To_Doubly_Linked_List;

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

public class Find_pairs_with_given_sum_in_doubly_linkedl_ist {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(head!=tail){
            if(head.data+tail.data==target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(head.data);
                pair.add(tail.data);
                ans.add(pair);
                head = head.next;
            }
            else if(head.data+tail.data<target){
                head = head.next;
            }
            else{
                tail = tail.prev;
            }
            
        }

        return ans;
    }
    public static void main(String[] args) {
        Node arr=new Node(1);
        arr.next=new Node(2);
        arr.next.prev=arr;
        arr.next.next=new Node(3);
        arr.next.next.prev=arr.next;
        arr.next.next.next=new Node(4);
        arr.next.next.next.prev=arr.next.next;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int k=7;
        ans=findPairsWithGivenSum(k,arr);
        System.out.println(ans);

    }
}

