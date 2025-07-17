//to create a thread either you can extends Thread class or implements the Runnable interface
package Multithreading.first;
public class Test{

public static void main(String args[]){

    World world = new World();
    world.start();
 
    for(int i=0; i<10; i++){
        System.out.println("Hello.........");
    }
    System.out.println("the current thread in test class: "+Thread.currentThread().getName());
}


    
}
