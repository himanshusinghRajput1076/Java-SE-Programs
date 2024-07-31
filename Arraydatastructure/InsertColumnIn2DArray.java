package Arraydatastructure;


import java.util.Arrays;

public class InsertColumnIn2DArray {
    public static void main(String[] args) {
        int [][] originalArray={{1,2,3},{4,5,6},{7,8,9}};
        int []column={10,11,12};
        int position=3;
        int [][]Array=new int[originalArray.length][originalArray[0].length+1];

        for(int i=0;i< originalArray.length;i++){
            for(int j=0;j<position;j++){
                Array[i][j]=originalArray[i][j];
            }
             Array[i][position]= column[i];
            for(int j=position;j< originalArray[0].length;j++){
                Array[i][j+1]=originalArray[i][j];
            }
        }
        System.out.println("Original Array");
        print2DArray(originalArray);
        System.out.println("new Array ");
        print2DArray( Array);
    }
    private static void print2DArray(int [][]Array){
        for(int []column:Array){
            System.out.println(Arrays.toString(column));
        }
    }
}
