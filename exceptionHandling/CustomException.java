package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 0;
        System.out.println("Enter 2 int ");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a < 0) {
                custom1Exception.InvalidNumeratorException ex = new custom1Exception.InvalidNumeratorException("Numerator must not be Negative ");
                throw ex;
            } else if (a == 0) {
                custom1Exception.InvalidNumeratorException ex = new custom1Exception.InvalidNumeratorException("Numerator must be zero ");
                throw ex;
            }

            int c = a / b;
            System.out.println("Div is " + c);
        } catch (InputMismatchException ex) {
            System.out.println("please input digit only ");
            System.exit(0);
        } catch (ArithmeticException ex) {
            System.out.println("Exception " + ex);
        } catch (custom1Exception.InvalidNumeratorException ex) {


            System.out.println("Exception " + ex.getMessage());
        }
        System.out.println("have a good day");
    }
}


