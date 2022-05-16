package javaTraining.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age; //o.age-this.age;
    }
}

public class SortApp {
    public static void main(String[] args) {
        ArrayList<Person> listOfNames = new ArrayList<>();
        listOfNames.add(new Person ("Vintik", 3));
        listOfNames.add(new Person ("Neznaika",4));
        listOfNames.add(new Person ("Znayechka", 2));
        listOfNames.add(new Person ("Shpuntik", 5));
        listOfNames.add(new Person ("Zvezdochka",6));
        listOfNames.add(new Person ("Romashka",1));

        System.out.println("Print before sort: ");
        print(listOfNames);

        System.out.println();

        Collections.sort(listOfNames);
        System.out.println("Print after sort: ");
        print(listOfNames);
    }

//public class SortApp {
//    public static void main(String[] args) {
//        ArrayList<String> listOfNames = new ArrayList<>();
//        listOfNames.add("Vintik");
//        listOfNames.add("Neznaika");
//        listOfNames.add("Znayechka");
//        listOfNames.add("Shpuntik");
//        listOfNames.add("Zvezdochka");
//        listOfNames.add("Romashka");
//
//        System.out.println("Print before sort: ");
//        print(listOfNames);
//
//        System.out.println();
//
//        Collections.sort(listOfNames);
//        System.out.println("Print after sort: ");
//        print(listOfNames);
//    }

//    static void print (ArrayList<String> listOfNames){
//        for (String name : listOfNames){
//            System.out.println(name);
//        }
//    }
static void print (ArrayList<Person> listOfNames){
    for (Person person : listOfNames){
        System.out.print("Name: "+person.name);
        System.out.println("Age: "+ person.age);
    }
}

}
