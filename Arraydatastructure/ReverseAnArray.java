package Arraydatastructure;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
   int start=0;
   int end = array.length-1;
   while(start<end){
       int temp=array[start];
       array[start]=array[end];
       array[end]=temp;
       start++;
       end--;
   }
    }
}