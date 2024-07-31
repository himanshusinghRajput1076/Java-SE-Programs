package nestedloop;

import java.util.Scanner;

public class IntegerPattern1 {
    public static void main(String[] args) {
        int n;
        int count=1;
        Scanner sc = new Scanner(System.in);
       n=sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=2;j<=i;j++) {
                System.out.print(count);
                count++;
            }

            System.out.println();
        }

    }
}
