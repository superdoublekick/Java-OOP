package Vehicles_Extension_2;



import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity); // Trucks consume more fuel
    }
}



