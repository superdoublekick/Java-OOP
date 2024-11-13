package WildFarm;

public class Mammal extends Animal{
    private String livingRegion;
    @Override
    public void makeSound() {

    }

    @Override
    public boolean willEatFood(Food food) {
        return false;
    }
}
