
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> allFruits = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "Orange");
        List<String> fruitsStartingWithA = FruitFilter.filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes", "Almond", "DragonFruit");
        fruitsStartingWithA = FruitFilter.filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);

        allFruits = Arrays.asList("Grapes", "DragonFruit");
        fruitsStartingWithA = FruitFilter.filterFruitsStartingWithA(allFruits);
        System.out.println("Fruits starting with 'A': " + fruitsStartingWithA);
    }
}