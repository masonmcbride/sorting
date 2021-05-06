public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        int minIndex;

        for (int sortedIndex = 0; sortedIndex < n - 1; sortedIndex++) {
            minIndex = sortedIndex + 1;
            for (int i = sortedIndex + 1; i < n; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            swap(arr, sortedIndex, minIndex);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
