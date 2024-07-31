package Arraydatastructure;

public class AddTwo2DArray {
    public static void main(String[] args) {
        int [][]arr1={{1,2,3},{4,5,6}};
        int [][]arr2={{7,8,9},{10,11,12}};
        int [][]result=new int [arr1.length][arr1[0].length];
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];

            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
