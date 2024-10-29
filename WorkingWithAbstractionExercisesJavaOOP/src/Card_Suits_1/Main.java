package Card_Suits_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        

    }
    public static void printEnum(Enum<?> enumm) {
        System.out.println("Card Ranks:");
        Arrays.stream(CardSuits.values()).forEach(System.out::println);
    }
}
