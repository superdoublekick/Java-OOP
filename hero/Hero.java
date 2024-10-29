package hero;

public class Hero {
    private String username;
    private int level;

    // Constructor
    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
