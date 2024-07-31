package assignment;

import java.util.Scanner;

public class practicle4 {
    public static void main(String[] args) {

        int n,rem=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=sc.nextInt();
        int org=n;
       while(n>0)
       {
          rem=n%10;
          rev=rev*10+rem;
          n=n/10;
       }
       if(org==rev)
           System.out.println("it is polidrome num");
       else
           System.out.println("not");
    }
}
