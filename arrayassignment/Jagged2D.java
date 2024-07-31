package arrayassignment;

import java.util.Scanner;

public class Jagged2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]arr = new int [2][];
        arr[0]=new int [3];
        arr[1]= new int [2];
      //  arr[2]= new int[2];
       // arr[3]=new int [5];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter no....");
                arr[i][j]=sc.nextInt ();
            }
        }
        System.out.println("Here is what you inputted");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"");

            }
            System.out.println();
        }
    }
}
