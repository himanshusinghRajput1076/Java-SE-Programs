package exceptionHandling;

import java.util.Scanner;

public class Finally2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 Integer ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Div is " + c);

        } catch (ArithmeticException ex) {
            System.out.println("Denominator should not be 0 ");
             System.exit(0);
        } finally {
            System.out.println("Have a good day ");
        }
    }
}