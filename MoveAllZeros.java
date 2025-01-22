import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeros {

    public static int countzero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
 
    public static void moveZeros(int[] arr) {

        ArrayList<Integer> nonZeroList = new ArrayList<>();

        int zeroCount = countzero(arr);
        // int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                nonZeroList.add(arr[i]);
            }
        }
        // for (int i = 1; i < zeroCount; i++) {
        //     arr[nonZeroList.size() + i] = 0;
        // }
        for (int i = 0; i < nonZeroList.size(); i++) {
           System.out.print(nonZeroList.get(i) + ",");
        }
      
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveZeros(arr);
        // int[] result = moveZeros(arr);
        // System.out.println(Arrays.toString(result));
    }
}
