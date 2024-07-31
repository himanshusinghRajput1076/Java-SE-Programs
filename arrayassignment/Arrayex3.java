package arrayassignment;

import java.util.Scanner;

public class Arrayex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int  []arr = new int[10];
      int n;
      for(int i=0;i<=9;i++)
      {
          System.out.println("Enter a num:");
          arr[i]=sc.nextInt();
      }
        System.out.println("you inputted:");
      for(int i=0;i<=9;i++)
      {
          System.out.println(arr[i]);
      }
    }
}
