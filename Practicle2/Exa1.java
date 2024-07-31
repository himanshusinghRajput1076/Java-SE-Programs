package Practicle2;



import basicooprogramming.CalAvg;

import java.util.Scanner;

public class Exa1 {

    private double n,m,p;
    public void setAvg(double a,double b,double c ) {
        n = a;
        m = b;
        p = c;
    }

    public double ShowAvg() {
            double sum=0;
            sum=n+m+p;
            sum=sum/3;
            return sum;
        }

        }

