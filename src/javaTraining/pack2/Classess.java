package javaTraining.pack2;

import java.util.StringJoiner;

public class Classess {
    public static void main(String[] args) {
        String[] names = {"One", "Two", "Three", "Four"};

//        String allNames ="{";
        StringJoiner sj = new StringJoiner(",","{","}");
        sj.setEmptyValue("no value");
        for(String name : names){
//            allNames += name + ", ";
            sj.add(name);
        }
//        allNames += "}";
//        System.out.println(allNames);
        System.out.println(sj);
    }
}
