package basicooprogramming;

import java.util.Scanner;

public class UseCalAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n,m,p;
        System.out.println("Enter a num:");
        n=sc.nextDouble();
        m=sc.nextDouble();
        p=sc.nextDouble();
        CalAvg obj=new CalAvg();
        obj.setAvg(n,m,p);
         double returns;
         returns=obj.ShowAvg();
        System.out.println(" Avg is"+returns);
    }
}
