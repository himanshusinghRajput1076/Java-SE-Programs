package exceptionHandling;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        try {

           Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("div is "+c);

        }
        catch(Exception ex){
            System.out.println("some prob occured ");
            System.out.println("reason "+ex.getMessage());
        }
    }
}
