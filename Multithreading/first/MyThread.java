package Multithreading.first;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
    MyThread t1 = new MyThread();
    System.out.println("current state when thread t1 is created: "+t1.getState());
    t1.start();
    System.out.println("current state of thread when start method is called: "+ t1.getState());
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println( "the current state of thread t1 after the sleep method called of main thread: "+ t1.getState());
    }
}
