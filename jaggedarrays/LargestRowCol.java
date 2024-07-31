package jaggedarrays;
public class LargestRowCol {
    public static void printLargest(int[][] arr) {

        if (arr.length == 0) {
            System.out.println("row 0" + Integer.MIN_VALUE);
            return;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        boolean isRow = true;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
            if (max < sum) {
                max = sum;
                index = i;
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i][j];
            }
            if (max < sum) {
                max = sum;
                index = j;
                isRow = false;
            }
        }
        if (isRow) {
            System.out.println("row" + index + " " + max);

        } else {
            System.out.println("col" + index + " " + max);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1}, {1, 1}};//or{{3,6,9},{1,4,7},{2,8,9}};
//or similar data can fill ;
        printLargest(arr);
    }
}