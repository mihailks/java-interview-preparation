package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {10, 4, 5, 22, 101, -1, 0, 40, 50, 30, 31, 31, 1, 5};

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        Arrays.stream(arr)
                .forEach(n -> System.out.print(n + " "));

    }
}
