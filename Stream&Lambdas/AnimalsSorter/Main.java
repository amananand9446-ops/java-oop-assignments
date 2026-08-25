
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("zebra", "lion", "tiger", "elephant", "giraffe");
        List<String> sortedAnimals = AnimalSorter.sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList("cat","dog","animal-x","elephant","mouse");
        sortedAnimals = AnimalSorter.sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList();
        sortedAnimals = AnimalSorter.sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        animals = Arrays.asList("a","b","d","c","a");
        sortedAnimals = AnimalSorter.sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);
    }
}