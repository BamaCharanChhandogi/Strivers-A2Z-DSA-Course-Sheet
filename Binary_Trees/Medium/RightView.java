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

public class RightView {

    public static void rightView(Node root, int ind, List<Integer> ans){
        if(root==null) return;
        if(ans.size()==ind){
            ans.add(root.data);
        }
        rightView(root.right,ind+1,ans);
        rightView(root.left,ind+1,ans);
    }
    public static List<Integer> rightSideView(Node root) {
        List<Integer> ans=new ArrayList<>();
        rightView(root,0,ans);
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

        System.out.println("Top view of the binary tree: " + result);
    }
}
