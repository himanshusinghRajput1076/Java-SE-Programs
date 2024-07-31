package nestedloop;

import java.util.Scanner;

public class IntegerPattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
       n=sc.nextInt();
        for(int i=4;i<=n;i++)
        {
            for(int j=i;j<=n;j++) {
                System.out.print(i);

            }

            System.out.println();
        }

    }
}
