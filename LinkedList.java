import java.util.*;
public class LinkedList {
 // Creating a static nested class for Node
       public static class Node {
        int data;
        Node next;

        // Constructor to initialize a node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Pointers and size for the linked list
    private Node head;
    private Node tail;
    private int size;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // 1. Insert a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // 2. Insert a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // 3. Insert a node at a specific index
    public void addMiddle(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        // Traverse to the node just before the index
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // 4. Print the linked list
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Testing the linked list
        ll.addFirst(1); // 2 -> 1 -> 5 -> 3 -> 4 -> null
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(7);
        ll.addMiddle(5, 2);

        ll.printLinkedList(); // Expected Output: 2 -> 1 -> 5 -> 3 -> 4 -> null
    }

}