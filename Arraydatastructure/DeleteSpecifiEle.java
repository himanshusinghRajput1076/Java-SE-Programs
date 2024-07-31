package Arraydatastructure;

public class DeleteSpecifiEle {
    public static int  [][] deleteElement(int [][]arr,int rowIndex,int colIndex) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] arrs = new int[rows][cols - 1];
        for (int i = 0; i < rows; i++) {
            if(i==rowIndex){
                for(int j=0,k=0;j<cols;j++){
                    if(j==colIndex)
                        continue;
                    arrs[i][k++]=arr[i][j];
                }
            }
            else{
                arrs[i]=arr[i];
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        int [][]Array=deleteElement(array,2,2);
        for(int []row:Array){
            for(int val:row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
