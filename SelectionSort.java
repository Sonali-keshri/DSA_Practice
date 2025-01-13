import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] arr, int min, int i) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        
    }

    public static int[] selectionSortAlgo(int[] array) {
        int n = array.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }

        return array;
    }

    public static void main(String[] args) {
        // int[] arr = { 30, 3, 4, 12, 18, 36 };
        int[] arr = { 13, 32, 26, 35, 10 };
        int[] res = selectionSortAlgo(arr);
        System.out.println(Arrays.toString(res));
    }

}