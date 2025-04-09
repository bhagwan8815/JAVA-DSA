//here i implement queue using linkedlist in java

public class QueueLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head = null;
        public static Node tail = null;

        // check for empty queue
        public boolean isEmpty() {
            return head == null || tail == null;
        }

        // add ele in queue ---ll in tail side
        public void add(int data) {
            // prepare a node
            Node newNode = new Node(data);

            // check for empty queue
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }


        //remove ele from queue --- ll from head side
        public int remove(){
            //check for empty queue
            if(isEmpty()){
                System.out.println("queue is empty.");
                return -1;
            }
            int front = head.data;
            if(head ==tail){ //means ak hi ele he queue me 
              head = tail =null;
            }else{
                head = head.next;
            }
            return front;
        }

        //take the peek ele from the queue form  head side in ll
        public int peek(){
             //check for empty queue
             if(isEmpty()){
                System.out.println("queue is empty.");
                return -1;
            }
            return head.data;
        }


        //print the queue
        public void printQueue(){
           Node temp = head;
           while(temp!=null ){
            System.out.print(temp.data +" ");
            temp = temp.next;
           }
           System.err.println();
        }

  


    //main fun
    public static void main(String args[]){
        QueueLL ql = new QueueLL();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);

        ql.printQueue();
        System.out.println("remove the first ele from queue:" + ql.remove());
        ql.printQueue();

        System.out.println("take front element :" + ql.peek());
        
      
    }
}
