package Binary_Trees.Medium;

import java.util.*;

public class Boundary_Traversal {
    static List<Integer> ans = new ArrayList<>();

    public static void BoundryRight(TreeNode root) {
        if (root == null)
            return;
        if (root.right != null) {
            BoundryRight(root.right);
            ans.add(root.val);
        } else if (root.left != null) {
            BoundryRight(root.left);
            ans.add(root.val);
        }
    }

    public static void BoundryLeft(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            ans.add(root.val);
            BoundryLeft(root.left);
        } else if (root.right != null) {
            ans.add(root.val);
            BoundryLeft(root.right);
        }
    }

    public static void Leaves(TreeNode root) {
        if (root == null)
            return;
        Leaves(root.left);
        if (root.left == null && root.right == null) {
            ans.add(root.val);
        }
        Leaves(root.right);
    }

    public static void printBoundary(TreeNode root) {
        if (root == null)
            return;
        ans.add(root.val);
        BoundryLeft(root.left);
        Leaves(root.left);
        Leaves(root.right);
        BoundryRight(root.right);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // You can create a sample tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);

        Boundary_Traversal.printBoundary(root);

        // Print the result or perform any other actions
        // System.out.println(result);
    }
}
