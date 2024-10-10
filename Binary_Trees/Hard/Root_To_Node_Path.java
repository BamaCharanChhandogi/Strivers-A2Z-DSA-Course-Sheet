import java.util.ArrayList;
import java.util.List;

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

public class Root_To_Node_Path {
    // Function to find the path from the
    // root to a given node with value 'x'
    public boolean getPath(TreeNode root, List<Integer> arr, int x) {
        // Base case: If the current
        // node is null, return false
        if (root == null) {
            return false;
        }

        // Add the current node's
        // value to the path list
        arr.add(root.val);

        // If the current node's value is equal
        // to the target value 'x', return true
        if (root.val == x) {
            return true;
        }

        // Recursively search for the target value
        // 'x' in the left and right subtrees
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }

        // If the target value 'x' is not found
        // in the current path, backtrack
        arr.remove(arr.size() - 1);
        return false;
    }

    // Function to find and return the path from
    // the root to a given node with value 'B'
    public List<Integer> solve(TreeNode A, int B) {
        // Initialize an empty
        // list to store the path
        List<Integer> arr = new ArrayList<>();

        // If the root node is null,
        // return the empty path list
        if (A == null) {
            return arr;
        }

        // Call the getPath function to find
        // the path to the node with value 'B'
        getPath(A, arr, B);

        // Return the path list
        return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Solution sol = new Solution();

        int targetLeafValue = 7;

        List<Integer> path = sol.solve(root, targetLeafValue);

        System.out.print("Path from root to leaf with value " +
                targetLeafValue + ": ");
        for (int i = 0; i < path.size(); ++i) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
}