package nestedloop;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n;
        int count=1;
        Scanner sc = new Scanner(System.in);
       n=sc.nextInt();

        for(int i=1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
