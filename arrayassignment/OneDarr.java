package arrayassignment;

import java.util.Scanner;

public class OneDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int  []arr = new int[4];
      int sum=0,i;
      for( i=0;i<=4;i++)
      {
          System.out.println("Enter a num:");
          arr[i]=sc.nextInt();
          sum=sum+arr[i];
      }
        System.out.println("sum is"+sum);


          System.out.println("avg is"+(float)(sum/4));

    }
}
