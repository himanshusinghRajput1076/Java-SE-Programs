package looping;


import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) throws Exception{
        int n ,m;
        char choice='y';
        Scanner sc=new Scanner(System.in);
        while(choice=='y')
        {
            System.out.println("Enter Two integer");
            n=sc.nextInt();
            m=sc.nextInt();
            System.out.println("sum is "+(n+m));
            System.out.println("Do you want to repeat ?.(y/n)");
            choice=(char)System.in.read();
        }
        System.out.println("Thank you for using the application👍👍");
    }
}
