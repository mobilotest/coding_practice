package javaTraining.JavaStuff;

import javaTraining.Operation;

public class OpImplement2 implements Operations {
    int x = 5;
    int y = 10;

    @Override
    public int sum(int x, int y) {
        return x+y+20;
    }

    @Override
    public int GetX(){
        return x;
    }
}
