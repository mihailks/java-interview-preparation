package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 22, 101, -1, 0, 40, 50, 30, 31, 31, 1, 5};

        for (int i = 1; i < arr.length; i++) { // from 0 because, when we have only 1 number it is already sorted
            int temp = arr[i]; //

            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;

        }


        Arrays.stream(arr)
                .forEach(n -> System.out.print(n + " "));
    }
}
