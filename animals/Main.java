package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String type = scanner.nextLine();
            if (type.equals("Beast!")) break;

            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age;
            String gender = tokens.length == 3 ? tokens[2] : ""; // Handle gender for Tomcat and Kitten

            try {
                age = Integer.parseInt(tokens[1]);
                Animal animal;
                switch (type) {
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
                // Print the animal immediately after creation
                System.out.println(animal + "\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
