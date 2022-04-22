package javaTraining;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.type="BMW";
        car1.model=2022;
        car1.mileDrive=10;
        car1.price=60000;
        System.out.println("Car price: "+car1.getPrice());

        Car car2 = new Car();
        car2.type="Toyota";
        car2.model=2006;
        car2.mileDrive=270000;
        car2.price=15000;
        System.out.println("Car price: "+car2.getPrice());
    }
}
