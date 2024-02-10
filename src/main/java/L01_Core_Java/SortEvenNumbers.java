package L01_Core_Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .sorted()
                .toList();

        List<Integer> sorted = numbers.stream()
                .sorted(Integer::compareTo)
                .toList();

        List<Integer> sorted1 = numbers.stream()
                .sorted((b1, b2) -> Integer.compare(b2, b1)).toList();

    }
}
