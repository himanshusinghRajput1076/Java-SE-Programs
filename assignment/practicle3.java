package assignment;

import java.util.Scanner;

public class practicle3 {
    public static void main(String[] args) {

        int n,rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=sc.nextInt();
        for(;n>0;) {
            rem=n%10;
            System.out.print(rem);
           n=n/10;
        }
    }
}
