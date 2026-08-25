import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1, 7, 8, 9, 7);
        List<Integer> distinctNumbers = DistinctNumbers.getDistinctNumbers(numbers);
        System.out.println("Distinct numbers: " + distinctNumbers);

        numbers = Arrays.asList(5, 5, 5, 6, 6, 6, 4, 4, 4);
        distinctNumbers = DistinctNumbers.getDistinctNumbers(numbers);
        System.out.println("Distinct numbers: " + distinctNumbers);
    }
}