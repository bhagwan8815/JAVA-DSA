public class DoublyCLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head;
            head.prev = head;
            size++;
            return;
        }
        newNode.next = head; // Point new node to the current head
        newNode.prev = tail; // Point new node to the tail

        tail.next = newNode; // Tail should point to the new head
        head.prev = newNode; // Old head should point back to the new head

        head = newNode; // Update head to new node
        size++;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail= newNode;
            head.next = head;
            head.prev= head;
            size++;
            return;
        }
      newNode.next=head;
      newNode.prev=tail;

      tail.next=newNode;
      head.prev=newNode;
      tail=newNode;
      size++;
        
    }

    // add at a particular index 
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
        Node temp = prev.next;
       
        newNode.prev=prev;
        newNode.next = temp;
        prev.next=newNode;
        size++;
    }

    //delete first 
    public int deleteFirst(){
        if(head==null){
            System.out.println("linked list is empty:");
            return -1;
        }
        int val = head.data;
        head = head.next;
        //System.out.println("the head now pointing to :"+ head.data);
        tail.next =head;
        head.prev= tail;
       
        size--;
        return val;
    }

    //delete last 
    public int deleteLast(){
        if(head==null){
            System.out.println("linked list is empty: ");
            return -1;
        }
        int i=0;
        Node temp= head;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int val = tail.data;
        tail = temp;
        tail.next= head;
        head.prev= tail;
        size--;
        return val;
    }

    //delete at a particular index 
    public int deleteMiddle(int index){
        if(size<=index){
            System.out.println("index out of bound:");
            return -1;
        }
        int i=0;
        Node prev = head;
        while(i<index-1){
            prev = prev.next;
            i++;
        }
        Node temp = prev.next;
        int val = temp.data;

        prev.next= temp.next;
        temp.next.prev = prev;
        size--;
        return val;
    }
    // print in forward direction head to tail
    public void printForward() {
        if (head == null) {
            System.out.println("Doubly Circular Linked List is empty!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public static void main(String args[]) {
        DoublyCLL dcll = new DoublyCLL();
      
        dcll.addFirst(4);
        dcll.addFirst(3);
        dcll.addFirst(2);
        dcll.addFirst(1);
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);
        dcll.addLast(5);
        dcll.addLast(6);
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);
        dcll.addMiddle(101, 4);
        dcll.addMiddle(102, 5);
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);

     System.out.println("the first deleted node is " +   dcll.deleteFirst());
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);

        System.out.println("the first deleted node is " +   dcll.deleteFirst());
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);


        System.out.println("last deleted node data is :" + dcll.deleteLast());
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);

        System.out.println("last deleted node data is :" + dcll.deleteLast());
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);


        System.out.println("middle deleted node data is : "+ dcll.deleteMiddle(3));
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);

        System.out.println("middle deleted node data is : "+ dcll.deleteMiddle(1));
        dcll.printForward();
        System.out.println("the size of linked list is :" + size);



    }

}
