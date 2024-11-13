package WildFarm;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private int foodEaten;

    public Animal(String name, String type, Double weight, int foodEaten) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract boolean willEatFood(Food food);

    public void eat(Food food) {
        if(!willEatFood(food)) {
            System.out.printf("%s are not eating this type of food!", this.type.name());
            return;
        }
        this.foodEaten += food.getQuantity();
    }
}
