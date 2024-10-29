package CardsWithPower_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        CardRank cardRank1 = CardRank.valueOf(cardRank);
        CardSuit cardSuit1 = CardSuit.valueOf(cardSuit);

        String result = String.format("Card name: %s of %s; Card power: %d", cardRank1, cardSuit1, cardRank1.getPower() + cardSuit1.getPower());
        System.out.println(result);
    }
}
