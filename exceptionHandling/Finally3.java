package exceptionHandling;

import java.util.Scanner;

public class Finally3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println("Enter 2 Integer ");
            int c = a / b;
            System.out.println("Div is " + c);

        } catch (ArithmeticException ex) {
            System.out.println("Denominator should not be 0 ");

        } finally {
            System.out.println("Have a good day ");
        }
    }
}