import behaviours.ICar;
import vehicles.Car;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<ICar> ownedVehicles;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.ownedVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public int getOwnedVehicles() {
        return ownedVehicles.size();
    }

    public void addVehicle(ICar car){
        this.ownedVehicles.add(car);
    }
}
