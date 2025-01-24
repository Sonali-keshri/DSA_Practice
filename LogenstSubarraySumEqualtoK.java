import java.util.HashMap;

public class LogenstSubarraySumEqualtoK {

    // Better Approach
    public static void longestSubarray2(int[] arr, int n, long k) {
        int len = 0;
        HashMap<Long, Integer> newmap = new HashMap<>();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                len = Math.max(len, i + 1);
            }

            // finding the previous remaing value like x-k;
            long rem = sum - k;

            if (newmap.containsKey(rem)) {
                len = Math.max(len, i - newmap.get(rem));
            }

            if (!newmap.containsKey(sum)) {
                newmap.put(sum, i);
            }

        }

        System.out.println("length : " +  len);
    }

    // Brute force Approach
    public static void longestSubarray(int[] arr, int n, int k) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println(len);

    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int arr[] ={2,3,5};
        int n = arr.length;
        long k = 5;
        longestSubarray2(arr, n, k);
    }
}

