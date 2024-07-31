package Arraydatastructure;

import java.util.Arrays;

public class CheckDuplicateinArray {
    public static boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
      for (int i=1;i<arr.length;i++){
          if(arr[i]==arr[i-1]){
              return true;
          }
      }
        return false;
    }

    public static void main(String[] args) {
        int []array={3,1,4,2,5,5};
        System.out.println(hasDuplicate(array));


    }
}
