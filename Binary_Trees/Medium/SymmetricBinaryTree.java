import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SymmetricBinaryTree {

    // Function to check if the tree is symmetric (mirror of itself)
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    // Helper function to check if two trees are mirrors of each other
    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
            && isMirror(t1.left, t2.right)
            && isMirror(t1.right, t2.left);
    }

    // Function to insert nodes in a binary tree
    public static TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert left of " + val + "? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter value for left child of " + val + ": ");
            root.left = insertNode(root.left, sc.nextInt());
        }

        System.out.println("Insert right of " + val + "? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter value for right child of " + val + ": ");
            root.right = insertNode(root.right, sc.nextInt());
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constructing the tree from user input
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        TreeNode root = new TreeNode(rootValue);

        root = insertNode(root, rootValue);

        // Check if the tree is symmetric
        if (isSymmetric(root)) {
            System.out.println("The tree is symmetric.");
        } else {
            System.out.println("The tree is not symmetric.");
        }
    }
}
