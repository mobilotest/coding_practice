package javaTraining.JavaStuff;

public interface Operations {
    int sum (int x, int y);

    int GetX();

    default void Display(){
        System.err.println("x: "+GetX());
    }
}
