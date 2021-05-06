public class QuickSort {

    public static void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + 1];
        while (true) {
            if (arr[low] >= pivot && arr[high] <= pivot) {
                swap(arr, low, high);
                low++;
                high--;
            } else if (arr[low] >= pivot) {
                high--;
            } else {
                low++;
            }

            if (high < low) {
                return high;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
