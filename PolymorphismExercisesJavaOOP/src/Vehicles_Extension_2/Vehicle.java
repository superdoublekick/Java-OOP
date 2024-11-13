package Vehicles_Extension_2;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (this.fuelQuantity + liters > tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += liters;
    }

    public String drive(double distance) {
        double neededFuel = distance * fuelConsumption;
        if (neededFuel > fuelQuantity) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        fuelQuantity -= neededFuel;
        return this.getClass().getSimpleName() + " travelled " + distance + " km";
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}


