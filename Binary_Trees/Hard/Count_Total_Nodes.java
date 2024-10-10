                                
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

public class Count_Total_Nodes {
    // Function to perform inorder
    // traversal and count nodes
    public void inorder(TreeNode root, int[] count) {
        // Base case: If the current
        // node is null, return
        if (root == null) {
            return;
        }

        // Increment count
        // for the current node
        count[0]++;

        // Recursively call inorder
        // on the left subtree
        inorder(root.left, count);

        // Recursively call inorder
        // on the right subtree
        inorder(root.right, count);
    }

    // Function to count nodes in the binary tree
    public int countNodes(TreeNode root) {
        // Base case: If the root is null,
        // the tree is empty, return 0
        if (root == null) {
            return 0;
        }

        // Initialize count variable to
        // store the number of nodes
        int[] count = {0};

        // Call the inorder traversal
        // function to count nodes
        inorder(root, count);

        // Return the final count of
        // nodes in the binary tree
        return count[0];
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Solution sol = new Solution();

        // Call the countNodes function
        int totalNodes = sol.countNodes(root);

        // Print the result
        System.out.println("Total number of nodes in the Complete Binary Tree: " + totalNodes);
    }
}
                                
                            
