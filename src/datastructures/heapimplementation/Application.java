package datastructures.heapimplementation;

public class Application {
    public static void main(String[]args){

        Heap newHeap = new Heap(10);
        newHeap.insert(10);
        newHeap.insert(12);
        newHeap.insert(42);
        newHeap.insert(35);
        newHeap.insert(16);
        newHeap.insert(86);
        newHeap.insert(42);
        newHeap.insert(7);

        newHeap.displayHeap();

    }
}
