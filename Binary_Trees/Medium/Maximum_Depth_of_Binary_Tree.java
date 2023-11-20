package Binary_Trees.Medium;
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

public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
            int lheight=maxDepth(root.left);
            int rheight=maxDepth(root.right);
            if(lheight>rheight){
                return (lheight+1);
            }
            else {
                return (rheight+1);
            }
        }
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