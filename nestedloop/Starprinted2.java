package nestedloop;

import java.util.Scanner;

public class Starprinted2 {
    public static void main(String[] args)  throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        char ch , count='A';
        ch=(char)System.in.read();
        for(char i='A';i<=ch;i++)
        {
            for(char j='A';j<=i;j++)
            {
               System.out.print(count);
               count++;
            }
            System.out.println();
        }

    }
}
