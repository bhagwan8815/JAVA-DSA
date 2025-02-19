public class CircularLL {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // insert at first
    public void addFirst(int data) {
        // prepare a node
        Node newNode = new Node(data);
        // check for empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            size++;

            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;

    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        // if ll is empty
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // Maintain circular link
        size++;
    }


    //add  a particular index 
    public void addMiddle(int data, int index){
        Node newNode = new Node(data);
        if(size<=index){
            System.out.println("index out of bound :");
            return;
        }
        int i=0;
        Node prev = head;
        while(i<index-1){
            prev = prev.next;
            i++;
        }
        // Node temp = prev.next;
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    //delete first node 
    public int deleteFirst(){
        if(head==null){
            System.out.println("list is empty: ");
            return -1;
        }
        int val = head.data;
        head = head.next;
        tail.next = head;
        size--;
        return val;
    }

    //delete last node 
    public int deleteLast(){
        if(head==null){
            System.out.println("list is empty: ");
            return -1;
        } 
        int i=0;
        Node temp = head;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int val= tail.data;
        temp.next = head;
        tail= temp;
        size--;
        return val;
    }

    //delete at a particular index 
    public int deleteMiddle(int index){
        if(size<=index){
            System.out.println("index out of bound. ");
            return -1;
        }
        int i=0;
        Node temp = head;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    // print linkedlist
    public static void print() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head); // Stop when we reach head again

        System.out.println("(head) ");
    }

    public static void main(String args[]) {
        CircularLL cll = new CircularLL();
        cll.addFirst(4);
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addFirst(11);
        print();
        System.out.println("size of linked list is : " + size);
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        print();
        System.out.println("size of linked list is :" + size);
        cll.addMiddle(88, 5);
        cll.addMiddle(99, 6);
        print();
        System.out.println("size of linked list is :" + size);
       System.out.println(" first deleted value is :" + cll.deleteFirst());
       System.out.println(" first deleted value is :" + cll.deleteFirst());
        print();
        System.out.println("size of linked list is :" + size);

        System.out.println("last deleted value is " + cll.deleteLast());
        System.out.println("last deleted value is " + cll.deleteLast());
        print();
        System.out.println("size of linked list is :" + size);

        System.out.println("mid deleted value is "+ cll.deleteMiddle(3));
        print();
        System.out.println("mid deleted value is "+ cll.deleteMiddle(4));
        print();
        System.out.println("size of linked list is :" + size);
        

    }
}
