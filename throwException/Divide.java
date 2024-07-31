package throwException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a= 10,b=0;
        try{
            System.out.println("enter 2 integer ");
            a=kb.nextInt();
            b=kb.nextInt();
            if(a<=0){
                ArithmeticException ex=new ArithmeticException("numerator must not be 0 ");
            throw ex;
            }
            int c=a/b;
            System.out.println("Div is "+c);
        }
        catch(InputMismatchException ex){
            System.out.println("please input digits only ");
        }
        catch(ArithmeticException ex){
            System.out.println("Exception "+ex);
        }
    }
}
