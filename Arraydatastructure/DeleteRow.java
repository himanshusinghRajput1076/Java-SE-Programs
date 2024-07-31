package Arraydatastructure;
///2D Array//
public class DeleteRow {
    public static int [][]deleteRow (int [][]arr,int rowIndex) {
        int [][] Array = new int [arr.length-1][arr[0].length];
        for(int i=0 ,k=0;i<arr.length;i++){
            if(i==rowIndex){
                continue;
            }
            Array[k++]=arr[i];
        }
        return Array;

    }

    public static void main(String[] args) {
        int [][]Array={{1,2,3},{4,5,6},{7,8,9}};
        int [][]array=deleteRow(Array,2);
        for(int[]row: Array){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
