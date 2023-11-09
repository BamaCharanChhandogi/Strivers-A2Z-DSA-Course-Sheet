package Binary_Trees.Medium;

public class Max_Path_Sum {
    int sum=Integer.MIN_VALUE;
    public int calculate(TreeNode root){
        if(root==null) return 0;
        int lheight=Math.max(calculate(root.left),0);
        int rheight=Math.max(calculate(root.right),0);
        sum = Math.max(sum,root.val+lheight+rheight);
        return root.val+ Math.max(lheight,rheight);
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        calculate(root);
        return sum;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left= new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left= new TreeNode(15);
        root.right.right = new TreeNode(7);

        Max_Path_Sum solution = new Max_Path_Sum();
        int result = solution.maxPathSum(root);
        System.out.println(result);
    }
}
