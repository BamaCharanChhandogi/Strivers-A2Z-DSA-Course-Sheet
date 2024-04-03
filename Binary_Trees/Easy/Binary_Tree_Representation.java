package Binary_Trees.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Binary_Tree_Representation {

  public static Node createTree(Vector<Integer> arr) {
    if (arr.isEmpty()) {
      return null; // Handle empty array case
    }

    Node root = new Node(arr.get(0));
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int i = 1;

    while (!q.isEmpty() && i < arr.size()) {
      Node temp = q.poll();

      // Left child
      if (i < arr.size()) {
        Node left = new Node(arr.get(i++));
        temp.left = left;
        q.add(left);
      }

      // Right child (if it exists)
      if (i < arr.size()) {
        Node right = new Node(arr.get(i++));
        temp.right = right;
        q.add(right);
      }
    }

    return root;
  }

  // Add your Node class definition here
  public static class Node {
    public int data;
    public Node left, right;

    public Node() {
      this.data = 0;
      left = null;
    }

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static void main(String[] args) {
    // Example usage:
    Vector<Integer> arr = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
    Node root = createTree(arr);
    // Perform operations on the tree rooted at 'root'
    System.out.println(root.data); // Output: 1
  }

}
