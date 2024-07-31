package basicooprogramming;

import java.util.Scanner;

public class Usecircle {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int r ;
            System.out.println("Enter radius");
            r=sc.nextInt();
            Circle obj=new Circle();
            obj.setradius(r);
            obj.calArea();
            obj.calcircumference();
        }
    }

