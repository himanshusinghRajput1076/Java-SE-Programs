package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5,b=23;
        try{
            System.out.println("Enter 2 integer");
            a=sc.nextInt();
            b=sc.nextInt();
            int  c=a/b;
            System.out.println("Division is "+c);
            System.exit(0);
        }
        catch(InputMismatchException ex){
            System.out.println("please input digits only ");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("please Input non zero denominator ");

        }
        int d=a+b;
        System.out.println("sum is "+d);
    }
}
