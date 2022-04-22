package javaTraining;

public class Car {
    String type;
    int model;
    double mileDrive;
    double price;

    double getPrice(){
        double newPice = price - (mileDrive*100);
        return newPice;
    }
}
