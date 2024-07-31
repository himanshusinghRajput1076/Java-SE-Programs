package arrayassignment;

import java.util.Arrays;

///find dublicate value
public class SortedArray {
    public static void SortArray(int[] arr) {
        int i;

        Arrays.sort(arr);
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;

            }
        }
    }

    public static void main(String[] args) {
        int []arr={0,3,1,5,4,3,2};
        SortedArray.SortArray(arr);
    }
}
