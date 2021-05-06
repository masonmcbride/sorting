public class MergeSort {

    public static void sort(int[] arr){
        mergesort(arr, arr.length);
    }

    public static void mergesort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergesort(l, mid);
        mergesort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    public static void merge(int[] arr, int[] l, int[] r, int lEnd, int rEnd) {
        int lp = 0, rp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (lp >= lEnd) {
                arr[i] = r[rp];
                rp++;
            } else if (rp >= rEnd) {
                arr[i] = l[lp];
                lp++;
            } else if (l[lp] > r[rp]) {
                arr[i] = r[rp];
                rp++;
            } else {
                arr[i] = l[lp];
                lp++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
