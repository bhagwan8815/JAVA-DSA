public class DoublyLL {
  public static class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size = 0;

  // insert at first
  public void addFirst(int data) {
    // prepare a node
    Node newNode = new Node(data);
    // check for empty list
    if (head == null) {
      head = tail = newNode;
      size++;
      return;
    }
    // if list is not empty
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    size++;
  }

  // insert at last
  public static void addLast(int data) {
    // prepare a node
    Node newNode = new Node(data);
    // check for empty list
    if (head == null) {
      head = tail = newNode;
      size++;
      return;
    }
    // if list is not empty
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    size++;

  }

  // insert at a particular index
  public static void addMiddle(int data, int index) {
    Node newNode = new Node(data);

    int i = 0;
    Node prev = head;
    while (i < index - 1) {
      prev = prev.next;
      i++;
    }
    Node temp = prev.next;

    newNode.next = temp;
    newNode.prev = prev;

    prev.next = newNode;
    temp.prev = newNode;
    size++;
  }

  // delete at first
  public static int deleteFirst() {
    if (head == null) {
      System.out.println("we can not perform deletion operation");
      return -1;
    }
    if (head == tail) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }

  // delete at last
  public static int deleteLast() {
    if (head == null) {
      System.out.println("we can not perfom deletion operation");
      return -1;
    }
    if (head == tail) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int i = 0;
    Node temp = head;
    while (i < size - 2) {
      temp = temp.next;
      i++;
    }
    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
  }

  // delete at a particulat index
  public static int deleteMiddle(int index) {
    if (head == null) {
      System.out.println("deletion can not perform : ");
      return -1;
    }
    if (index >= size) {
      System.out.println("index out of bound , we can not perform deletion :");
      return -1;
    }

    Node prev = head;
    int i = 0;
    while (i < index - 1) {
      prev = prev.next;
      i++;
    }
    Node temp = prev.next;
    int val = temp.data;
    prev.next = temp.next;
    temp.next.prev = temp.prev;
    size--;
    return val;

  }

  // print linkedlist
  public static void print() {
    int len = 0;
    Node temp = head;
    while (temp != null) {
      len++;
      System.out.print(temp.data + " <->");
      temp = temp.next;

    }
    System.out.println("null");
    System.out.println("the len of linked list is : " + len);
  }

  public static void main(String args[]) {
    DoublyLL ll = new DoublyLL();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addLast(15);
    ll.addLast(16);
    ll.addMiddle(99, 4);
    print();
    System.out.println("size of linked is : " + size);
    System.out.println("first deleted element is : " + ll.deleteFirst());
    print();
    System.out.println("size of linked is : " + size);

    System.out.println("last deleted element is : " + ll.deleteLast());
    print();
    System.out.println("size of linked is : " + size);

   System.out.println("middle deleted element is : "+ ll.deleteMiddle(2));
   print();
  
   System.out.println("size of linked is : " + size);
  }

}
