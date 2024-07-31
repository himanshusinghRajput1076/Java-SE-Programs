package exceptionHandling;

import java.util.Scanner;

public class DivideAndSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int a, b;
            System.out.println("Enter an Integer ");
            a = sc.nextInt();
            do{
            b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println("Div is " + c);
            } catch (ArithmeticException ex) {
                System.out.println("Please input non zero denominator ! again inputted b value");
            }
            int d= a+b;
                System.out.println("sum is "+a+b);
        }while(b==0);
    }
}
