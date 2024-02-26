package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 22, 101, -1, 0, 40, 50, 30, 31, 31, 1, 5};

        mergeSort(arr);



        Arrays.stream(arr)
                .forEach(n -> System.out.print(n + " "));
    }

    private static void mergeSort(int[] arr) {
        if (arr.length<2){
            return;
        }
        int mid = arr.length/2;
        int[] leftHalf= new int[mid];
        int[] rightHalf= new int[arr.length - mid]; // because if the arr is odd (9/2=4) we will miss one element

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            rightHalf[i - mid] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge
        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
