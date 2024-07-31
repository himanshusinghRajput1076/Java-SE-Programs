package assignment;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;n--)
        {
            fact=fact*n;
        }
        System.out.println("factorial is"+fact);
    }
}
