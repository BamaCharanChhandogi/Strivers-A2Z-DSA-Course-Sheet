import java.util.Stack;
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

public class IterativePreorderTraversal {

    // Method to perform iterative preorder traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Stack to store nodes for processing
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            // Visit the root
            result.add(node.val);

            // Push right child first (so that left child is processed first)
            if (node.right != null) {
                stack.push(node.right);
            }

            // Push left child
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        IterativePreorderTraversal traversal = new IterativePreorderTraversal();
        List<Integer> result = traversal.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}
