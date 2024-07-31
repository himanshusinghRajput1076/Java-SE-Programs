package assignment;

import java.util.Scanner;

public class Armnum {

        public static void main(String[] args) {
            double sum=0;
            int temp=0;
            int rem=0,x=0;
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter a Number ");

            int n=kb.nextInt();

            for(int i=1;i<=n;i++)
            {
                temp=i;
                     rem=i%10;
                    sum=sum+rem*rem*rem;
                    x=i/10;


                System.out.println(sum);
            }
        }
    }


