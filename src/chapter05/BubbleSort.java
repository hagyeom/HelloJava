package chapter05;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 2, 8, 7};

        doBubbleSort(intArray);

        PrintArray.printIntArray(intArray);
    }

    public static void doBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
