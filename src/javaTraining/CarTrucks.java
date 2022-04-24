package javaTraining;

import java.security.acl.Owner;

public class CarTrucks extends Car{
    private boolean hasTruck;
    void SetHasTruck(boolean hasTruck){
        this.hasTruck = hasTruck;
    }

    public CarTrucks(){
        System.out.println("Constructor CarTrucks is created");
    }
    void GetOwner(){
        System.out.println("Owner: "+ owner);;
    }

    @Override
    double getPrice(){
        // to override add different content
        double newPice = price - (mileDrive*50);
        return newPice;
    }
}
