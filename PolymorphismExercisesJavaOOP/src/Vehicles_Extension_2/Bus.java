package Vehicles_Extension_2;


public class Bus extends Vehicle {
    private boolean hasPeople;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.hasPeople = false;
    }

    public void setHasPeople(boolean hasPeople) {
        this.hasPeople = hasPeople;
    }

    @Override
    public String drive(double distance) {
        if (hasPeople) {
            this.fuelConsumption += 1.4; // Increase consumption if there are people
        }
        String result = super.drive(distance);
        if (hasPeople) {
            this.fuelConsumption -= 1.4; // Reset consumption back after driving
        }
        return result;
    }
}

