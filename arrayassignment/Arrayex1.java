package arrayassignment;

import java.util.Scanner;

public class Arrayex1 {
    public static void main(String[] args) {
        int []arr;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter number in Array of size "+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("sum is "+sum);
        System.out.println("Average is "+(float)sum/n);
    }
}
