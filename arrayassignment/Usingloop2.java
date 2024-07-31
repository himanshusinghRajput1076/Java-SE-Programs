package arrayassignment;//2 D array using loop
import java.util.Scanner;
public class Usingloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        int sum=0;
        System.out.println("Enter num of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        arr=new int [r][c];
        for(int i=0;i<arr.length;i++) {
            System.out.println("enter num of rows "+(i+1));
            for (int j = 0; j<arr[0].length; j++) {

                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("sum of all number is "+sum+"\navg is "+((float)sum/(r*c)));

    }
}
