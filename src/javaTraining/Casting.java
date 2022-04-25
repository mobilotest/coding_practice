package javaTraining;

public class Casting {
    public static void main(String[] args) {
        CarTrucks.owner = "Pupkin";
        CarTrucks cartrucks = new CarTrucks();
        cartrucks.type = "GMC";
        cartrucks.SetHasTruck(true);
        cartrucks.model = 2017;
        cartrucks.mileDrive = 230;
        cartrucks.price = 74000;

        Car myCar = (Car) cartrucks;

        System.out.println(myCar.mileDrive);
    }
}
