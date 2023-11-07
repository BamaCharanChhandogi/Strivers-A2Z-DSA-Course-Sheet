package Binary_Trees.Easy;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Inorder {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        Inorder solution = new Inorder();
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }
}