package Binary_Trees.Medium;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.left.left = new TreeNode(3);
        p.left.right = new TreeNode(4);
        p.right = new TreeNode(3);
        p.right.left = new TreeNode(5);
        p.right.right = new TreeNode(6);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.left.left = new TreeNode(3);
        q.left.right = new TreeNode(4);
        q.right = new TreeNode(3);
        q.right.left = new TreeNode(5);
        q.right.right = new TreeNode(6);

        Same_Tree solution = new Same_Tree();
        boolean result = solution.isSameTree(p,q);
        System.out.println(result);
    }
}
