package Binary_Trees.Easy;
import java.util.*;
public class Level_order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        if (root == null) {
            return ans;
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            ans.add(list);
        }
        
        return ans;
    }
public static void main(String[] args) {
    Level_order_Traversal sol = new Level_order_Traversal();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    List<List<Integer>> ans = sol.levelOrder(root);
    for (List<Integer> list : ans) {
        System.out.println(list);
    }
}
}

