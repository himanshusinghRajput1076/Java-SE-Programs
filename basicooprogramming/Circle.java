package basicooprogramming;
import java.util.Scanner;


public class Circle {
    private int radius;
    public void setradius(int r){
     radius=r;
    }
    public void calArea(){
        double ar=Math.PI*Math.pow(radius,2);
        System.out.println("Area is "+ar);
    }
    public void calcircumference(){
        double circ = 2*Math.PI*radius;
        System.out.println("circumference is "+circ);
    }
}


