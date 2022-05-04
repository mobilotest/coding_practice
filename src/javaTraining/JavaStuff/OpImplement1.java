package javaTraining.JavaStuff;

import javaTraining.Operation;

public class OpImplement1 implements Operations {
    int x = 5;
    int y = 10;

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int GetX(){
        return x;
    }

    public static void main(String[] args) {
        System.out.println(new OpImplement1().GetX());
        new OpImplement1().Display();
    }
}
