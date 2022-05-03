package javaTraining.pack;

public class MyJava8 {
    public static void main(String[] args) {
//        MyJava8Runnable myNewRunnable = new MyJava8Runnable();
        Runnable myNewRunnable = ()-> System.out.println("Thread is working");
            Thread t = new Thread(myNewRunnable);
            t.start();
    }
}
