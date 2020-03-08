package datastructures.linkedList;

public class Node {
    int data;
    Node next;

    Node previous; // for doublyLinkedList

    public void displayNode(){
        System.out.println("{ "+data+" }");
    }
}
