package basicooprogramming;

import java.util.Scanner;

public class UseCircle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter radius");
        r=sc.nextInt();
        Circle1 obj = new Circle1();
        obj.setradius( r);
        double x;
        x=obj.calArea();
        System.out.println("Area"+x);
        x=obj.CalCircumference();
        System.out.println("circumference"+x);
    }
}
