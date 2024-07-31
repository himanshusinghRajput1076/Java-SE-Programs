package Arraydatastructure;

public class Access2DArray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Access first ele "+arr[0][0]);
        System.out.println("sec ele"+arr[0][1]);
        //modifying ele
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
       // System.out.println(arr[0][0]);
        //System.out.println(arr[0][1]);
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
