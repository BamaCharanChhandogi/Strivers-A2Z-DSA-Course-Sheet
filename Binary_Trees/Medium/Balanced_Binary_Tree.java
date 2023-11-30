package Binary_Trees.Medium;

public class Balanced_Binary_Tree {
    public static int  height(TreeNode node){
        if (node == null) return 0;
        int LeftR= height(node.left);
        int RightR = height(node.right);
        if(LeftR==-1 || RightR==-1 || Math.abs(LeftR-RightR) > 1) return -1;
        return Math.max(LeftR,RightR) + 1;
    }
    public static boolean isBalanced(TreeNode node){
        if (node == null) return false;
        return height(node)!=-1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        Balanced_Binary_Tree solution = new Balanced_Binary_Tree();
        boolean result = solution.isBalanced(root);
        System.out.println(result);
    }
}
