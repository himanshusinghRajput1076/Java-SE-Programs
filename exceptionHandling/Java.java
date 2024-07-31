package exceptionHandling;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter Integers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Division is" + c);
        }catch(Exception ex){
            System.out.println(" some prob occured");
            System.out.println("reasson:"+ex.getMessage());
        }
    }
}
