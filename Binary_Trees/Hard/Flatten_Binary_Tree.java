                                
import java.util.*;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Flatten_Binary_Tree {
    // Function to flatten a binary tree
    // to a right next Linked List structure
    public void flatten(TreeNode root) {
        // Initialize a pointer
        // 'curr' to the root of the tree
        TreeNode curr = root;

        // Iterate until 'curr'
        // becomes NULL
        while (curr != null) {
            // Check if the current
            // node has a left child
            if (curr.left != null) {
                // If yes, find the rightmost
                // node in the left subtree
                TreeNode pre = curr.left;
                while (pre.right != null) {
                    pre = pre.right;
                }

                // Connect the rightmost node in
                // the left subtree to the current
                // node's right child
                pre.right = curr.right;

                // Move the entire left subtree to the
                // right child of the current node
                curr.right = curr.left;

                // Set the left child of
                // the current node to NULL
                curr.left = null;
            }

            // Move to the next node
            // on the right side
            curr = curr.right;
        }
    }
}

// Print the preorder traversal of the
// Original Binary Tree
class Main {
    public static void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // Print the Binary Tree along the
    // Right Pointers after Flattening
    public static void printFlattenTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printFlattenTree(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(8);

        Solution sol = new Solution();

        System.out.print("Binary Tree Preorder: ");
        printPreorder(root);
        System.out.println();

        sol.flatten(root);

        System.out.print("Binary Tree After Flatten: ");
        printFlattenTree(root);
        System.out.println();
    }
}
                                
                            
