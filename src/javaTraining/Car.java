package javaTraining;

public class Car {
    public String type;
    public int model;
    public double mileDrive;
    public double price;
    static String owner;
    Owners ownwers;
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
        ownwers = new Owners();
        ownwers.firstName = "Vasya";
        ownwers.lastName = "Driver";
        // agregation means you can have an instance of one class inside another class;
    }

    public Car(){
        System.out.println("constructor 2 is created");
    }
}
