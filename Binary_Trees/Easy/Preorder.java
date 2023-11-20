package Binary_Trees.Easy;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    private List<Integer> preorderResult = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        performPreorderTraversal(root);
        return preorderResult;
    }

    private void performPreorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        preorderResult.add(root.val);
        performPreorderTraversal(root.left);
        performPreorderTraversal(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        
        Preorder traversal = new Preorder();
        System.out.println(traversal.preorderTraversal(root));
    }
}
