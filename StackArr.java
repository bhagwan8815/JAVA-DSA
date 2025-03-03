//implemenation of stack using java 

public class StackArr {

         private int arr[];
         private int top;
         private int capacity;

         public StackArr(int size){
            arr = new int[size];
             top = -1;
             capacity = size;
         }
 

    //push a data into the stack
    public void pushdata(int data){
        //if stack is overflow 
        if(top == capacity-1){
            System.out.println("stack overflow...");
            return;
        }
        top = top+1;
        arr[top] = data;
    }


    //pop a data from  a stack
    public int popData(){
        //if stack is underflow, that means stack is empty
        if(top==-1) {
          System.out.println("Stack underflow....");
        }

        int val = arr[top];
        top = top-1; // top--
        return val;

    }

    //get the top element from the stack 
    public int PeekData(){
        int val = arr[top];
        return val;
    }

    // is stack is empty
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    //size of the stack
    public int getSize(){
        return top+1;
    }
 
    //print the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        StackArr sa = new StackArr(5);
        sa.pushdata(10);
        sa.pushdata(20);
        sa.pushdata(30);
        sa.pushdata(40);
        sa.pushdata(50);
        sa.printStack();
      System.out.println(  "size of stack is : "+sa.getSize() );
     

       System.out.println("top deleted element is :" + sa.popData());
       sa.printStack();
       System.out.println(  "size of stack is : "+sa.getSize() );


       System.out.println("Peek element is : "+ sa.PeekData());


       
   


    }
    
}
