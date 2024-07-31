package assignment;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        int n=0,m=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the numbers");
        n=kb.nextInt();
        System.out.println("Enter the numbers");
        m=kb.nextInt();
        if(n>m)
        {
            System.out.println("largest number "+n);
            System.out.println("smallest number "+m);
        }
        else if(m>n)
        {
            System.out.println("smallest number "+n);
            System.out.println("largest number "+m);
        }
        else
            System.out.println("you are wrong inputted");

    }
}
