package basicooprogramming;

import java.util.Scanner;

public class UseFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a num:");
        n=sc.nextInt();
        FibonacciS obj = new FibonacciS();
        obj.setFibo( n);
        obj.Prints();
        int Show;
        Show=obj.Prints();
        System.out.println(" series "+ Show);
    }
}
