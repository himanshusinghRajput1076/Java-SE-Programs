package assignment;

import java.util.Scanner;

public class Accept{

    public static void main(String[] args) {
            double a, b, c;
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter First Double");
            a = kb.nextDouble();
            System.out.println("enter second double");
            b = kb.nextDouble();
            c = a + b;
            System.out.println("numbers are" +a+" + "+b);
            System.out.println("sum is"+c);
        }
    }
