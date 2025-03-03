
public class StackLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }


    public static Node head = null; // this is out top in term of stack 
    public static boolean isEmpty(){
        return head==null;

    }

    //push
    public  void push(int data){
        //prepare a node
      Node newNode = new Node(data);
      if(isEmpty()){
         head = newNode;
         return;
      }
  
      newNode.next = head;
      head = newNode;
    }

    //pop
    public  int pop(){
        //if stack is empty
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty:");
            return -1;
        }
        int val= head.data;
        return val;
    }

    public  void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        System.out.print("Stack elements (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.printStack();
        
        System.out.println("deleted element :"+ stack.pop());
        stack.printStack();
        System.out.println("peek element :"+ stack.peek());
        stack.printStack();
        System.out.println();
    }
    

}
