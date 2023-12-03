package Binary_Trees.Medium;

public class Diameter_of_Binary_Tree {

    static int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = diameterOfBinaryTree(node.left);
        int rightHeight = diameterOfBinaryTree(node.right);
        
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(2);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        Diameter_of_Binary_Tree solution = new Diameter_of_Binary_Tree();
        solution.diameterOfBinaryTree(root);
        System.out.println(maxDiameter);
    }
}