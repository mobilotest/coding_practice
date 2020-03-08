package datastructures.queue;

public class App {

    public static void main(String[]args){

        Queue myQueue = new Queue(5);

        myQueue.insert(100);
        myQueue.insert(4);
        myQueue.insert(90);
        myQueue.insert(12);
        myQueue.insert(66);
        myQueue.insert(22);
        myQueue.insert(27);
        myQueue.insert(82);
        myQueue.insert(2);
        myQueue.view();
    }
}
