package Arraydatastructure;

public class Reverse2DArray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{8,9,10}};
        reverse2DArray(arr);
        for (int num : arr[0]) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static void reverse2DArray(int [][]array){
        for(int []row:array){
            reverseArray(row);
        }
    }
    public  static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
