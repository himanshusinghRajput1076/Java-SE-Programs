package nestedloop;

import java.util.Scanner;

public class Zero_1Triangle {
    public static void main(String[] args) {
        int n ,sum=0;
        Scanner sc = new Scanner(System.in);
       n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                sum=i+j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
