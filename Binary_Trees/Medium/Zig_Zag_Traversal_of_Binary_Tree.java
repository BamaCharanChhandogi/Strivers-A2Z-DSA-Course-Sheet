package Binary_Trees.Medium;

import java.util.*;

public class Zig_Zag_Traversal_of_Binary_Tree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null) return ans;
        queue.offer(root);
        boolean zig=false;
        while(!queue.isEmpty()){
            int levelOrder = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i=0;i<levelOrder;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            if(zig){
                 Collections.reverse(sublist);
            }
            ans.add(sublist);
            zig=!zig;
        }
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
