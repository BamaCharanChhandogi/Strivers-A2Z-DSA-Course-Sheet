package Binary_Trees.Medium;

public class Diameter_of_Binary_Tree extends TreeNode{
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return maxDiameter;
    }

    private int calculateDiameter(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = calculateDiameter(node.left);
        int rightHeight = calculateDiameter(node.right);

        // Update the maximum diameter
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right = new TreeNode(5);

        Diameter_of_Binary_Tree solution = new Diameter_of_Binary_Tree();
        int result = solution.diameterOfBinaryTree(root);
        System.out.println(result);
    }
}