package assignment;

import java.util.Scanner;

public class SalesMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many sales man ?");
        int n=sc.nextInt();
        System.out.print(" "+n);
        System.out.println("how many sales by sales man 1?. ");
        int sale=sc.nextInt();
        System.out.print(" "+sale);
        System.out.println("enter sale"+sale+"value");
        while(sale>0) {
            if(sale!=0) {
                int salevalue = sc.nextInt();

                System.out.println(salevalue);
            }
        }
    }
}
