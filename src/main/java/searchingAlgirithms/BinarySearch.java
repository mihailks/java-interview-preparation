package searchingAlgirithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 4, 5, 5, 10, 22, 30, 31, 31, 40, 50, 101};
        int[] input1 = {1, 5};
        int key = -1;

        int result = iterative(input, key);
        System.out.println("Iterative: " + result);

        int start = 0;
        int end = input.length - 1;

        int recursive = recursiveSearch(input, start, end, key);
        System.out.println("Recursive: " + recursive);

    }

    private static int recursiveSearch(int[] arr, int start, int end, int key) {
        if (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                return recursiveSearch(arr, start, mid - 1, key);
            } else if (key > arr[mid]) {
                return recursiveSearch(arr, mid + 1, end, key);
            }
        }
        return -1;
    }

    public static int iterative(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

}
