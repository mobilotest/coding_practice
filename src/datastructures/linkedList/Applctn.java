package datastructures.linkedList;

public class Applctn {
    public static void main(String[]args){
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(77);
        mylist.insertFirst(88);
        mylist.insertFirst(99);
        mylist.insertLast(3333);

        mylist.displayList();
    }
}
