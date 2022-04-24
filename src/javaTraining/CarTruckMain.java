package javaTraining;

public class CarTruckMain {
    public static void main(String[] args) {
        CarTrucks.owner = "Pupkin";
        CarTrucks cartrucks = new CarTrucks();
        cartrucks.type = "GMC";
        cartrucks.SetHasTruck(true);
        cartrucks.model = 2017;
        cartrucks.mileDrive = 230;
        cartrucks.price = 74000;

        System.out.println("Truck: " + cartrucks.getPrice());
        cartrucks.GetOwner();

    }
}
