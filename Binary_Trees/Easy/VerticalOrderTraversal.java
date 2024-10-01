import java.util.*;

// Define the TreeNode class
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    // Function to perform vertical order traversal of the binary tree
    void verticalOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        // TreeMap to store the vertical order traversal
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        // Queue to hold pairs of tree nodes and their horizontal distances
        Queue<Pair> queue = new LinkedList<>();

        // Start with the root node at horizontal distance 0
        queue.add(new Pair(node, 0));

        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            TreeNode currentNode = temp.node;
            int horizontalDistance = temp.horizontalDistance;

            // Add the current node's data to the list for its horizontal distance
            map.putIfAbsent(horizontalDistance, new ArrayList<>());
            map.get(horizontalDistance).add(currentNode.data);

            // If the current node has a left child, add it to the queue with horizontal distance -1
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, horizontalDistance - 1));
            }

            // If the current node has a right child, add it to the queue with horizontal distance +1
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, horizontalDistance + 1));
            }
        }

        // Print the vertical order traversal
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            System.out.println("Vertical Level " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Helper class to store a node and its horizontal distance
    class Pair {
        TreeNode node;
        int horizontalDistance;

        public Pair(TreeNode node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        // Create the binary tree
        BinaryTree tree = new BinaryTree();

        // Manually create nodes and form the tree structure
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        // Perform the vertical order traversal
        System.out.println("Vertical Order Traversal of binary tree:");
        tree.verticalOrderTraversal(tree.root);
    }
}
