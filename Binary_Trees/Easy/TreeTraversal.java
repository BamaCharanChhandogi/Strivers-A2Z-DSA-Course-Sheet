/* Preorder, Inorder, and Postorder Traversal in one Traversal in java */

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class TreeTraversal {

    // Lists to store preorder, inorder, and postorder traversals
    List<Integer> preorderList = new ArrayList<>();
    List<Integer> inorderList = new ArrayList<>();
    List<Integer> postorderList = new ArrayList<>();
    
    // Method to traverse the tree and record all three traversals in one go
    public void traverse(TreeNode node) {
        if (node == null) return;

        // Preorder: Visit node first
        preorderList.add(node.val);
        
        // Traverse the left subtree
        traverse(node.left);
        
        // Inorder: Visit node between left and right subtrees
        inorderList.add(node.val);
        
        // Traverse the right subtree
        traverse(node.right);
        
        // Postorder: Visit node after left and right subtrees
        postorderList.add(node.val);
    }
    
    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeTraversal traversal = new TreeTraversal();
        traversal.traverse(root);
        
        System.out.println("Preorder Traversal: " + traversal.preorderList);
        System.out.println("Inorder Traversal: " + traversal.inorderList);
        System.out.println("Postorder Traversal: " + traversal.postorderList);
    }
}
