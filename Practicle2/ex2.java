package Practicle2;

import java.util.Scanner;

public class ex2 {



        public static void main(String[] args) {
            int n;
            System.out.println("Enter a num:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int i;
            for (i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    System.out.println("it is not prime");
                    break;

                }
            }
            System.out.println("prime");

            }
        }

