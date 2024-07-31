package Arraydatastructure;

import java.util.Arrays;

// Row insertion in 2D array
public class Insertion2D {
    public static void main(String[] args) {
        int[][] originalArray = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[] row = {1, 2, 3};
        int position = 1;

        int[][] array = new int[originalArray.length + 1][originalArray[0].length];

        // Copy rows up to the insertion position
        for (int i = 0; i < position; i++) {
            array[i] = originalArray[i];
        }

        // Insert the new row at the specified position
        array[position] = row;

        // Copy the remaining rows after the insertion position
        for (int i = position; i < originalArray.length; i++) {
            array[i + 1] = originalArray[i];
        }

        System.out.println("Original array:");
        print2DArray(originalArray);

        System.out.println("New array:");
        print2DArray(array);
    }

    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
