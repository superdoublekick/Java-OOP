
package Vehicles_Extension_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read vehicle information
        String[] carInfo = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));

        String[] truckInfo = scanner.nextLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));

        String[] busInfo = scanner.nextLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        // Read number of commands
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Drive":
                    String vehicleType = commandParts[1];
                    double distance = Double.parseDouble(commandParts[2]);
                    if (vehicleType.equals("Car")) {
                        System.out.println(car.drive(distance));
                    } else if (vehicleType.equals("Truck")) {
                        System.out.println(truck.drive(distance));
                    } else if (vehicleType.equals("Bus")) {
                        bus.setHasPeople(true); // Assuming bus has people by default
                        System.out.println(bus.drive(distance));
                    }
                    break;
                case "DriveEmpty":
                    if (commandParts[1].equals("Bus")) {
                        bus.setHasPeople(false);
                        double emptyDistance = Double.parseDouble(commandParts[2]);
                        System.out.println(bus.drive(emptyDistance));
                    }
                    break;
                case "Refuel":
                    vehicleType = commandParts[1];
                    double liters = Double.parseDouble(commandParts[2]);
                    if (vehicleType.equals("Car")) {
                        car.refuel(liters);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refuel(liters);
                    } else if (vehicleType.equals("Bus")) {
                        bus.refuel(liters);
                    }
                    break;
                default:
                    break;
            }
        }

        // Print remaining fuel
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", bus.getFuelQuantity());

        scanner.close();
    }
}
