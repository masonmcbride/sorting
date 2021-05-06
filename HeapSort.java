import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int k = n - 1; k >= 0; k--) {
            heapify(arr, n, k);
        }
        for (int sortedIndex = n - 1; sortedIndex >= 0; sortedIndex--) {
            swap(arr, sortedIndex, 0);
            heapify(arr, sortedIndex, 0);
        }

    }

    public static void heapify(int[] arr, int n, int k) {
        int maxIndex = k;
        for (int i = 1; i < 3 && 2 * k + i < n; i++) {
            if (arr[2 * k + i] > arr[maxIndex]) {
                maxIndex = 2 * k + i;
            }
        }

        if (maxIndex != k) {
            swap(arr, k, maxIndex);
            heapify(arr, n, maxIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
