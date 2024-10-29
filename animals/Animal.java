package animals;



public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        if (name == null || name.trim().isEmpty() || age < 0 || gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract String produceSound();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                this.name + " " + this.age + " " + this.gender + "\n" +
                this.produceSound();
    }
}
