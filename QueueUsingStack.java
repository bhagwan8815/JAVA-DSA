import java.util.*;
public class QueueUsingStack {
    
    public static class  Queue{
     Stack<Integer> s1  = new Stack<>();
     Stack<Integer> s2 = new Stack<>();

     public boolean isEmpty(){
        return s1.isEmpty();
     }

     //add
     public void add(int data){
        //check s1 is empty or not
        if(s1.isEmpty()){
            s1.push(data);
        }else{
            //while s1 is not empty transfter ele into s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //now add data into s1
            s1.push(data);
            //again transfer ele into s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
     }

     //remove
     public int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty:");
            return -1;
        }
        return s1.pop();
     }

     //peek
     public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty:");
            return -1;
        }
        return s1.peek();
     }

     public void printQueue() {
        Stack<Integer> temp = new Stack<>();
    
        // Transfer elements from s1 to temp to reverse the order
        while (!s1.isEmpty()) {
            temp.push(s1.pop());
        }
    
        // Print elements and push back to s1 to preserve original 
        System.out.print("rear-> ");
        while (!temp.isEmpty()) {
            int val = temp.pop();
            System.out.print(val + " ");
            s1.push(val); // Push back to s1
        }
        System.out.print("<-front");
        System.out.println();
    }
    
    }


    //main fun
    public static void main(String args[]){
      Queue q = new Queue();

      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
    q.printQueue();
    System.out.println("the first remove element is :" + q.remove());
 q.printQueue();

    System.out.println("the front ele from the queue is : "+ q.peek() );

  q.add(15);
  q.printQueue();
    }
}
