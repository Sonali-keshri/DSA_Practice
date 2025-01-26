// Bubble Sort works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The name "Bubble Sort" comes from the way smaller elements bubble to the top of the list during each pass.

// In BubbleSort find the max and swap it with adjacent item. 

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
