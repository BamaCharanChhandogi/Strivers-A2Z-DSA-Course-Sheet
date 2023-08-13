package LinkedList.Learn_1D_LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Inserting_a_node_in_LinkedList {
    public static Node insertAtFirst(Node list, int newValue) {
        Node newNode = new Node(newValue);
        newNode.next = list;
        return newNode;
    }

    public static void main(String[] args) {
        Node list = null; // Initialize an empty linked list

        // Insert elements into the linked list using your insertAtFirst method
        list = insertAtFirst(list, 4);
        list = insertAtFirst(list, 3);
        list = insertAtFirst(list, 2);
        list = insertAtFirst(list, 1);
        list = insertAtFirst(list, 0);

        // Print the linked list elements
        Node current = list;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
