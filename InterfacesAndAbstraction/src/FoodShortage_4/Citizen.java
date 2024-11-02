package FoodShortage_4;

import FoodShortage_4.Birthable;
import FoodShortage_4.Identifiable;
import FoodShortage_4.Person;

public class Citizen implements Identifiable, Birthable, Person, Buyer {
    private static final int INCREASES_FOOD_WHIT_TEN = 10;

    private final String name;
    private final int age;
    private final String id;
    private final String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        this.food += INCREASES_FOOD_WHIT_TEN;
    }

    @Override
    public int getFood() {
        return this.food;
    }


}
