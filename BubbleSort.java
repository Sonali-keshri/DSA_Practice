import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            Boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 32, 26, 35, 10 };
        int[] res = bubbleSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
