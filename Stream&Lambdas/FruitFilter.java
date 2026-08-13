
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitFilter {

    public static List<String> filterFruitsStartingWithA(List<String> fruits) {
        return fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());
    }
}