package datastructures.linkedList;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode; //if empty, last well refer to new Node being created
        } else {
            first.previous = newNode;
        }
        newNode.next = first;//the new node's next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;// assigning old last to newNode
            newNode.previous = last;//the old last will be the newNode's previous
        }
        last = newNode; //the linkedList's last field should point to the new node
    }

    //assume non-empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next; // we are assigning the reference of the node following the old first node to the first field in the linked list object
        return temp; //return the deleted old first node

    }

    // assume non-empty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null; // the last node's previous node's next field will point to null
        }
        last = last.previous;
        return temp;
    }

    // assume non-empty lisn
    public boolean insertAfter(int key, int data) {
        Node current = first; //we start from the beginning of the list
        while (current.data != key) { //as long as we have not found the key in a particular node
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;
        if (current.next == null) {
            last = newNode;
        } else {
            newNode.next = current.next; //new node's next field should point to the node ahead of the current one
            current.next.previous = newNode; //the node ahead of current, it's previous field should point to new node
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //assume non-empty list
    public Node deleteKey(int key){
        Node current = first; // start from the beginning
        while (current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }
        if(current == first){
            first = current.next; // make the first field point to mode following current since current will be deleted
        }else{
            current.previous.next = current.next;
        }
        if(current ==last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.println("List (last --> first)");
        Node current = last;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

