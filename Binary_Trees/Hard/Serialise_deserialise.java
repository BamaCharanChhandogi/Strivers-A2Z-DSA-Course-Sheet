                            
import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Serialise_deserialise {

    // Encodes the tree into a single string
    public String serialize(TreeNode root) {
        // Check if the tree is empty
        if (root == null) {
            return "";
        }

        // Initialize an empty string
        // to store the serialized data
        StringBuilder sb = new StringBuilder();
        // Use a queue for
        // level-order traversal
        Queue<TreeNode> q = new LinkedList<>();
        // Start with the root node
        q.offer(root);
    

        // Perform level-order traversal
        while (!q.isEmpty()) { // q is not empty
            // Get the front node in the queue
            TreeNode curNode = q.poll();

            // Check if the current node is
            // null and append "#" to the string
            if (curNode == null) {
                sb.append("#,");
            } else {
                // Append the value of the
                // current node to the string
                sb.append(curNode.val).append(",");
                // Push the left and right children
                // to the queue for further traversal
                q.offer(curNode.left);
                q.offer(curNode.right);
            }
        }

        // Return the
        // serialized string
        return sb.toString();
    }

    // Decode the encoded
    // data to a tree
    public TreeNode deserialize(String data) {
        // Check if the
        // serialized data is empty
        if (data.isEmpty()) {
            return null;
        }

        // Use a StringBuilder to
        // tokenize the serialized data
        StringBuilder s = new StringBuilder(data);
        // Read the root value
        // from the serialized data
        int commaIndex = s.indexOf(",");
        String str = s.substring(0, commaIndex);
        s.delete(0, commaIndex + 1);
        TreeNode root = new TreeNode(Integer.parseInt(str));

        // Use a queue for 
        // level-order traversal
        Queue<TreeNode> q = new LinkedList<>();
        // Start with the root node
        q.offer(root);

        // Perform level-order traversal
        // to reconstruct the tree
        while (!q.isEmpty()) { // q is not empty
            // Get the front node in the queue
            TreeNode node = q.poll();

            // Read the value of the left
            // child from the serialized data
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
            // If the value is not "#", create a new
            // left child and push it to the queue
            if (!str.equals("#")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(str));
                node.left = leftNode;
                q.offer(leftNode);
            }

            // Read the value of the right child
            // from the serialized data
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex + 1);
            // If the value is not "#", create a
            // new right child and push it to the queue
            if (!str.equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(str));
                node.right = rightNode;
                q.offer(rightNode);
            }
        }

        // Return the reconstructed
        // root of the tree
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        Solution solution = new Solution();
        System.out.print("Orignal Tree: ");
        inorder(root);
        System.out.println();

        String serialized = solution.serialize(root);
        System.out.println("Serialized: " + serialized);

        TreeNode deserialized = solution.deserialize(serialized);
        System.out.print("Tree after deserialization: ");
        inorder(deserialized);
        System.out.println();
    }
}
                            
                        