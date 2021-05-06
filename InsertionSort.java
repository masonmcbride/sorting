public class InsertionSort {

    public static void sort(int[] arr) {
        int j;
        for (int i = 0; i < arr.length; i++) {
            j = i;
            while (j - 1 >= 0 && arr[j-1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
