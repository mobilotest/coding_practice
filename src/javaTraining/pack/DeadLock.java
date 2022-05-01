package javaTraining.pack;

public class DeadLock {
    public static void main(String[] args) {
        final String passanger1 = "Gogol";
        final String passanger2 = "Mogol";

        Thread bus1 = new Thread(){
            @Override
            public void run(){
                synchronized (passanger1){
                    System.out.println("bus 1 locked passenger 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (passanger2){
                        System.out.println("bus 1 is locked passenger 2");
                    }
                }
            }
        };

        Thread bus2 = new Thread(){
            @Override
            public void run(){
                synchronized (passanger2){
                    System.out.println("bus 2 locked passenger 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (passanger1){
                        System.out.println("bus 2 is locked passenger 1");
                    }
                }
            }
        };

        bus1.start();
        bus2.start();
    }
}
