
package workingWithAbstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        var pocket = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long stones = 0;
        long money = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long count = Long.parseLong(safe[i + 1]);

            String gems = "";

            if (name.length() == 3) {
                gems = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                gems = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                gems = "Gold";
            }

            if (gems.equals("")) {
                continue;
            } else if (input < pocket.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (gems) {
                case "Gem":
                    if (!pocket.containsKey(gems)) {
                        if (pocket.containsKey("Gold")) {
                            if (count > pocket.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (pocket.get(gems).values().stream().mapToLong(e -> e).sum() + count > pocket.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!pocket.containsKey(gems)) {
                        if (pocket.containsKey("Gem")) {
                            if (count > pocket.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (pocket.get(gems).values().stream().mapToLong(e -> e).sum() + count > pocket.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!pocket.containsKey(gems)) {
                pocket.put((gems), new LinkedHashMap<String, Long>());
            }

            if (!pocket.get(gems).containsKey(name)) {
                pocket.get(gems).put(name, 0L);
            }


            pocket.get(gems).put(name, pocket.get(gems).get(name) + count);
            if (gems.equals("Gold")) {
                gold += count;
            } else if (gems.equals("Gem")) {
                stones += count;
            } else if (gems.equals("Cash")) {
                money += count;
            }
        }

        for (var x : pocket.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}