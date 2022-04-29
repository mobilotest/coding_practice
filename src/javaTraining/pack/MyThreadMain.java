package javaTraining.pack;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("t1");
        t1.start();
        MyThread t2 = new MyThread("t2");
        t2.start();
        System.out.println("Thread is working");
        t1.sleep(7000);
        t1.isRunning = false;

        //For Runnable:
        myRunnable r = new myRunnable("runnable");
        Thread t = new Thread(r);
        t.start();
    }
}
