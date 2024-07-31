package Practicle2;

import java.util.Scanner;

public class Ex5 {
    //binary to decimal
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary;
        int decimal = 0,base=1,rem;
        System.out.println("Enter a binary num:");
        binary=sc.nextInt();
        while(binary>0)
        {
            rem=binary%10;

          decimal=decimal+rem*base;
          base= base*2;
          binary=binary/10;
        }

        System.out.println("decimal num is "+decimal);
    }
}
