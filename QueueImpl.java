public class QueueImpl {

    public static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // check empty queue
        public boolean isEmpty() {
            return rear == -1;
        }

        // add a element in queue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = rear + 1; // rear++;
            arr[rear] = data;
        }

        // remove a element from queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue underflow");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // take the front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue underflow");
                return -1;
            }
            return arr[0];

        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       
        q.printQueue();
  System.out.println("remove fist ele from front :" + q.remove());
  q.printQueue();
  
  System.out.println("take the front element from front :" + q.peek());
  
        

    }

}