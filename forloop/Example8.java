package forloop;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer and stop press 0 ");
        for(;;)
        {
            n=sc.nextInt();
            if(n==0)
                break;
             sum=sum+n;
        }
        System.out.println("sum is"+sum);
    }
}
