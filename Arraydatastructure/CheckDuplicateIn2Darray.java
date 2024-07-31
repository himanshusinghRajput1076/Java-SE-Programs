package Arraydatastructure;

import java.util.Arrays;

public class CheckDuplicateIn2Darray{
    public static boolean hasDuplicate(int [][]matrix) {
   int rows = matrix.length;
   int cols = matrix[0].length;
   int []flatArray=new int [rows*cols];
   int index = 0;
   for(int []row:matrix){
       for(int num:row){
           flatArray[index++]=num;

       }
   }
   Arrays.sort(flatArray);
   for(int i=1;i<flatArray.length;i++){
       if(flatArray[i]==flatArray[i-1]){
           return true;
       }
   }
         return false;
    }

    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{10,6,5},{8,9,7}};
        System.out.println(hasDuplicate(matrix));
    }
}
