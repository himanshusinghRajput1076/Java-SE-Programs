package Practicle2;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a num:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        for (i = 2; i < n/2; i++) {
            if (n % i == 0) {
                break;

            }
        }
        if (i == n) {
            System.out.println("prime");
        } else {
            System.out.println("it is not prime");

        }
    }
}