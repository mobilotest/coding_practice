package javaTraining.collections;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<String>();
        ar.add("developer");
        ar.add("tester");
        ar.add("admin");
        ar.add("manager");
        System.out.println(ar.get(3));
        ar.remove(3);
        for (String st : ar) {
            System.out.println(st);
        }

    // array list
        ArrayList<Employees> emp = new ArrayList<>();
        emp.add(new Employees("Myshka", 21));
        emp.add(new Employees("Kuznechik", 2));
        emp.add(new Employees("Murashyk", 1));
        for (Employees st : emp) {
            System.out.println(st.name + " : "+st.age);
        }
    }
        static class Employees{
            String name;
            int age;
            public Employees(String name, int age){
                this.name = name;
                this.age = age;
            }
        }
}
