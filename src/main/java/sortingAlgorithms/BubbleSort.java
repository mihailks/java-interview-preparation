package sortingAlgorithms;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {10, 4, 5, 22, 101, -1, 0, 40, 50, 30, 31, 31, 1, 5};

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        Arrays.stream(input)
                .forEach(n -> System.out.print(n + " "));
    }
}
