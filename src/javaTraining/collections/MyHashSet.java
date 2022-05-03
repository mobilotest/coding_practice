package javaTraining.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> ls = new HashSet<>();
        ls.add("Shyshal");
        ls.add("Myshal");
        ls.add("Pyornul");
        ls.add("Vyshel");
        ls.add("Vyshel");

        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        TreeSet<String> myset = new TreeSet<>();
        myset.add("Shyshal");
        myset.add("Myshal");
        myset.add("Pyornul");
        myset.add("Vyshel");
        myset.add("Vyshel");

        Iterator<String> myitr = myset.iterator();
        while(myitr.hasNext()){
            System.out.println(myitr.next());
        }
    }
}
