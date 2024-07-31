package basicooprogramming;

import java.util.Scanner;

public class UseFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        Factorial obj=new Factorial();
        obj.setFact(n);
        obj.ShowFact();

    }
}
