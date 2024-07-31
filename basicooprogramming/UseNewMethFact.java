package basicooprogramming;

import java.util.Scanner;

public class UseNewMethFact {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n;
            System.out.println("Enter a number");
            n=sc.nextInt();
            Factorial obj=new Factorial();
            obj.setFact(n);
            int S ;
            S =  obj.ShowFact();
            System.out.println("Factorial is "+S);

        }
    }


