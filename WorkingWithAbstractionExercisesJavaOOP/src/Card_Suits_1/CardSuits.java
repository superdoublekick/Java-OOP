package Card_Suits_1;

public enum CardSuits {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }
}
