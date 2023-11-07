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

public class PostOrder {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return ans;
    }
    public void postorder(TreeNode root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        PostOrder solution = new PostOrder();
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println(result);
    }
}
