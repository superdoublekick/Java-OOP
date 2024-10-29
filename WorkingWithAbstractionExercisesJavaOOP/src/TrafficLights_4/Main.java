package TrafficLights_4;

import java.security.SignatureException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Signal[] signals = Arrays.stream(scanner.nextLine().split("\\s+")).map(Signal::valueOf).toArray(Signal[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Signal.updateSignal(signals);
            Signal.printSignals(signals);
        }
    }
}
