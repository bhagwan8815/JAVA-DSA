package BST;

public class BinaryST {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // build the binary search tree

    public static Node Build(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = Build(root.left, val);
        } else {
            root.right = Build(root.right, val);
        }
        return root;
    }

    // inorder function for printing the BST data in sorted order
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);

        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // main function
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Build(root, values[i]);
        }

         System.out.println("inorder of bst");
        inorder(root);
         System.out.println("\npreorder of bst");
          preorder(root);
          System.out.println("\npostorder of bst");
          postorder(root);
       
    }

}
