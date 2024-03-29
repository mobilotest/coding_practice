package javaTraining.pack;

public class MyThread extends Thread{
    boolean isRunning = true;
    static String name;
    public MyThread(String name){
        this.name = name;
        System.out.println(name);
    }

    @Override
    public void run() {
        int count=0;
        while (isRunning){
            System.out.print(name +": "+count +", ");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Display();
    }

    synchronized static void Display(){ // means shared
        int count = 0;
        while (count<10){
            System.out.println(name+" : "+count);
            count++;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
