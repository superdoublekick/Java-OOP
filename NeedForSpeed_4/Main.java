package NeedForSpeed_4;


public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(50, 120);
        Vehicle sportCar = new SportCar(70, 250);
        Vehicle raceMotorcycle = new RaceMotorcycle(30, 100);

        car.drive(10);
        sportCar.drive(5);
        raceMotorcycle.drive(3);

        System.out.println("Car fuel left: " + car.getFuel());
        System.out.println("SportCar fuel left: " + sportCar.getFuel());
        System.out.println("RaceMotorcycle fuel left: " + raceMotorcycle.getFuel());
    }
}
