package dowhileloop;

import java.util.Scanner;

public class Stringex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
            System.out.println("Enter 2 integer ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("sum is "+(a+b));
            System.out.println("Do you want to continue (yes/no)? ");
            sc.nextLine();
            choice=sc.nextLine();
        }while(choice .equalsIgnoreCase("yes"));
    }
}
