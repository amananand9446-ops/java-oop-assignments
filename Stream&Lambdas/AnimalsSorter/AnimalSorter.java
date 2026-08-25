
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalSorter {

    public static List<String> sortAnimalsByLengthDescending(List<String> animals) {
        return animals.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}