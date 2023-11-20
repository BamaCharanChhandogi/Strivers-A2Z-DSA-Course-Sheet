package Binary_Trees.Medium;
import java.util.*;
public class Zig_Zag_Traversal_of_Binary_Tree {
    public List<List<Integer>> levelorder(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null)
            return ans;

        if (ans.size() == level)
            ans.add(new ArrayList<>());

        // Modify this part to add elements in reverse order when needed
        if (level % 2 == 0) {
            ans.get(level).add(root.val);
        } else {
            ans.get(level).add(0, root.val);
        }

        levelorder(root.left, ans, level + 1);
        levelorder(root.right, ans, level + 1);

        return ans;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelorder(root, ans, 0);
        return ans;
    }

    public static void main(String[] args) {
        // You can create a sample tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Zig_Zag_Traversal_of_Binary_Tree solution = new Zig_Zag_Traversal_of_Binary_Tree();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print the result or perform any other actions
        System.out.println(result);
    }
}
