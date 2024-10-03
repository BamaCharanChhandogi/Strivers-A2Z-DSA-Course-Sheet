import java.util.Stack;
import java.util.Scanner;

// Class representing a node in the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class InorderTraversal {
    
    // Function to perform iterative inorder traversal
    public static void inorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current); // Place pointer to a tree node on stack before traversing its left subtree
                current = current.left;
            }

            // Current must be null at this point, pop the top of the stack
            current = stack.pop();
            System.out.print(current.data + " ");

            // We have visited the node and its left subtree. Now it's right subtree's turn
            current = current.right;
        }
    }

    // Function to insert nodes in a binary tree
    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertNode(root.left, value);
        } else if (value > root.data) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        // Taking user input for the binary tree
        System.out.println("Enter number of nodes: ");
        int nodes = sc.nextInt();
        System.out.println("Enter node values: ");
        for (int i = 0; i < nodes; i++) {
            int value = sc.nextInt();
            root = insertNode(root, value);
        }

        // Performing iterative inorder traversal
        System.out.println("Inorder traversal of the binary tree:");
        inorderIterative(root);
    }
}
