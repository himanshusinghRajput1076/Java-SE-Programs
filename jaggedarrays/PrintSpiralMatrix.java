package jaggedarrays;

public class PrintSpiralMatrix {
    public static void main(String[] args) {
        int [][]arr=new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sRow=0;
        int sCol=0;
        int eRow=arr.length-1;
        int eCol=arr[0].length-1;
        int total=arr.length*arr[0].length;
        int count=0;
        while(count<total)
        {
            for(int i=sCol;i<=eCol;i++)
            {
                System.out.print(arr[sRow][i]);
                count++;
            }
            sRow++;
            for(int i=sRow;i<=eRow;i++)
            {
                System.out.print(arr[i][eCol]+" ");
                count++;

            }
            eCol--;
            for(int i=eCol;i>=sCol;i--){
                System.out.println(arr[eRow][i]);
                count++;

            }
            eRow--;
            for(int i=eRow;i>=sRow;i--){
                System.out.print(arr[i][sCol]);
                count++;
            }
            sCol++;
        }
    }
}
