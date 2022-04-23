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

    public Car(String type, int model, double mileDrive, double price){
        this.type = type;
        this.model = model;
        this.mileDrive = mileDrive;
        this.price = price;
        System.out.println("constructor 1 is created");
    }

    public Car(){
        System.out.println("constructor 2 is created");
    }
}
