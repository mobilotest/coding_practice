package datastructures.singlylinkedlist;

public class App {
    public static void main(String[]args){
        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(77);
        mylist.insertFirst(88);
        mylist.insertFirst(99);
        mylist.insertLast(3333);

        mylist.displayList();
    }
}
