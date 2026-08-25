import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        List<String> itemNames = Arrays.asList(
//                "Laptop",
//                "Mouse",
//                "Keyboard",
//                "Monitor"
//        );
//
//        List<String> lowercaseNames = itemNames.stream()
//                .map(String::toLowerCase)
//                .collect(Collectors.toList());
//
//        System.out.println(lowercaseNames);
//    }

//        List<Item> items = Arrays.asList(
//                new Item(1, "Laptop", 50000, 5),
//                new Item(2, "Mouse", 800, 10),
//                new Item(3, "Keyboard", 1500, 3),
//                new Item(4, "Monitor", 12000, 2)
//        );
//
//        items.stream()
//                .filter(item -> item.getPrice() > 1000)
//                .map(Item::getName)
//                .forEach(System.out::println);

        // Task 2b

        List<Item> items = Arrays.asList(
                new Item(1, "Laptop", 50000, 5),
                new Item(2, "Mouse", 800, 10),
                new Item(3, "Keyboard", 1500, 0),
                new Item(4, "Monitor", 12000, 2),
                new Item(5, "Laptop", 50000, 3),
                new Item(6, "Headphones", 2000, 8),
                new Item(7, "Webcam", 3000, 4)
        );
//        boolean outOfStock = items.stream()
//                .anyMatch(item -> item.getQuantity() == 0);
//
//        System.out.println("Any item out of stock: " + outOfStock);
        // Task 2c
//        boolean noNegativeQuantity = items.stream()
//                .noneMatch(item -> item.getQuantity() < 0);
//
//        System.out.println("No negative quantity: " + noNegativeQuantity);

//        long count = items.stream()
//                .filter(item -> item.getPrice() > 1000)
//                .count();
//
//        System.out.println("Number of items priced above 1000: " + count);

        // Task 3
//        items.stream()
//                .filter(item -> item.getPrice() > 1000)
//                .filter(item -> item.getQuantity() > 0)
//                .map(Item::getName)
//                .distinct()
//                .sorted()
//                .limit(5)
//                .forEach(System.out::println);
//        // Task 4a
//        int totalQuantity = items.stream()
//                .map(Item::getQuantity)
//                .reduce(0, Integer::sum);
//
//        System.out.println("Total quantity: " + totalQuantity);

        // Task 4b
//        Item mostExpensiveItem = items.stream()
//                .reduce((item1, item2) ->
//                        item1.getPrice() > item2.getPrice()
//                                ? item1
//                                : item2)
//                .orElse(null);
//
//        System.out.println("Most expensive item: "
//                + mostExpensiveItem.getName());
        // Task 4c
        String names = items.stream()
                .map(Item::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");

        System.out.println("Item names: " + names);

    }
}