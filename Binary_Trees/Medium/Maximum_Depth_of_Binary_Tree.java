package Binary_Trees.Medium;

import java.util.*;
public class Maximum_Depth_of_Binary_Tree {
    // public int maxDepth(TreeNode root) {
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftHeight = maxDepth(root.left);
    //     int rightHeight = maxDepth(root.right);
    //     return Math.max(leftHeight, rightHeight)+1;
    // }
    // 2nd approach
    public int maxDepth(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        if (root == null) {
            return 0;
        }
        while (!qu.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.poll();
                if (node.left != null)
                    qu.add(node.left);
                if (node.right != null)
                    qu.add(node.right);
                list.add(node.val);
            }
            ans.add(list);
        }
        return ans.size();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Maximum_Depth_of_Binary_Tree solution = new Maximum_Depth_of_Binary_Tree();
        int result = solution.maxDepth(root);
        System.out.println(result);
    }
}