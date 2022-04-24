package javaTraining;

public class CarMain {
    public static void main(String[] args) {
        Car.owner = "Smith";

        Car car1 = new Car("BMW", 2020, 5, 15000);
        System.out.println("Car owner: "+car1.owner);
        System.out.println("Car price: "+car1.getPrice());

        Car car2 = new Car();
        car2.type="Toyota";
        car2.model=2006;
        car2.mileDrive=90;
        car2.price=15000;
        System.out.println("Car owner: "+car1.owner);
        System.out.println("Car price: "+car2.getPrice());
    }
}
