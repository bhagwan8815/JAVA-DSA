//stack implementation using ArrayList
import java.util.ArrayList;;

public class StackArrayList {
    private ArrayList<Integer>stack;
    private int top;

    public StackArrayList(){
        stack = new ArrayList<>();
        top = -1;
    }

    //push
    public void push(int data){
        stack.add(data);
        top++;
    }

    //pop
    public int pop(){
        if (top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = stack.remove(top);
        top--;
        return val;
    }

    //peek

    public int peek(){
        int val = stack.get(top);
        return val;
    }

  
    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }


    //print 
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        StackArrayList stackArr = new StackArrayList();

        stackArr.push(10);
        stackArr.push(20);
        stackArr.push(30);
        stackArr.push(40);
        stackArr.push(50);
        stackArr.push(60);
        stackArr.printStack();
        System.out.println("size of stack is : " + stackArr.size());

 System.out.println("deleted element is :"  + stackArr.pop());
 System.out.println("size of stack is : " + stackArr.size());
 System.out.println("peek element is :" + stackArr.peek());
    }



    
}
