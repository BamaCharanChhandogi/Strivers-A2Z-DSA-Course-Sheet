package Binary_Trees.Medium;

import java.util.*;

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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }

            list.add(subList);
        }

        return list;
    }
}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        // Test case: root = [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);

        // Output: [[3],[9,20],[15,7]]
        System.out.println(result);
    }
}
