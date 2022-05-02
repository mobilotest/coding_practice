package javaTraining.collections;


import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Shyshal");
        ls.add("Myshal");
        ls.add("Pyornul");
        ls.add("Vyshel");

        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
