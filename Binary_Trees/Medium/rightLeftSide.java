package Binary_Trees.Medium;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Pair{
    int hd;
    Node node;
    public Pair(Node node,int hd){
        this.node = node;
        this.hd = hd;
    }
}

public class rightLeftSide {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    public static List<Integer> rightSideView(Node root) {
        List<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        int min=0,max=0;

         while(!q.isEmpty()){
            Pair pair = q.poll();
            int hd = pair.hd;
            Node temp = pair.node;
            map.put(hd,temp.data);
            min = Math.min(hd,min);
            max = Math.max(hd,max);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd+1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for(int i=min;i<=max;i++){
            ans.add(map.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        // Sample usage
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        List<Integer> result = rightSideView(root);

        System.out.println("side view of the binary tree: " + result);
    }
}
