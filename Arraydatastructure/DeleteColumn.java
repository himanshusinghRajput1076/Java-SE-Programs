package Arraydatastructure;

public class DeleteColumn {
    public static int [][]deleteColumn(int[][]arr,int colIndex){
        int [][] Array = new int [arr.length][arr[0].length-1];
                for(int i=0;i< arr.length;i++){
                    for(int j=0,k=0;j<arr[0].length;j++){
                        if(j==colIndex){
                            continue;
                        }
                        arr[i][k++]=arr[i][j];
                    }
        }
                return arr;
    }

    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        int [][] Array=deleteColumn(array,1);
        for(int []row:Array){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
