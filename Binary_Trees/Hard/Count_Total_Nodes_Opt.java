                                
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

public class Count_Total_Nodes_Opt {
    // Function to count the total number
    // of nodes in a Complete Binary Tree
    public int countNodes(TreeNode root) {
        // Check if the tree is empty
        if (root == null) {
            return 0;
        }

        // Find the height of the left subtree
        int lh = findHeightLeft(root);
        // Find the height of the right subtree
        int rh = findHeightRight(root);

        // If the heights are equal, the tree
        // is a full binary tree, and we can
        // calculate the total nodes
        if (lh == rh) {
            return (1 << lh) - 1;
        }

        // If the heights are not equal,
        // recursively count nodes in the
        // left and right subtrees
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Function to find the
    // height of the left subtree
    private int findHeightLeft(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    // Function to find the
    // height of the right subtree
    private int findHeightRight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Count_Total_Nodes_Opt sol = new Count_Total_Nodes_Opt();

        // Call the countNodes function
        int totalNodes = sol.countNodes(root);

        // Print the result
        System.out.println("Total number of nodes in the Complete Binary Tree: " + totalNodes);
    }
}           

                                
                            