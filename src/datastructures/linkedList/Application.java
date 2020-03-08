package datastructures.linkedList;

public class Application {
    public static void main(String[]args){
        DoublyLinkedList thelist = new DoublyLinkedList();
        thelist.insertFirst(100);
        thelist.insertFirst(50);
        thelist.insertFirst(77);
        thelist.insertFirst(88);
        thelist.insertFirst(11);
        thelist.insertLast(55);
        thelist.insertLast(22);
        thelist.displayBackward();
        thelist.displayForward();
        thelist.deleteFirst();
        thelist.deleteLast();
        thelist.deleteKey(22);
        thelist.insertAfter(11,22);
        thelist.insertAfter(100,101);
        thelist.displayForward();
    }
}
