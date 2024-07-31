package forloop;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n,fact=1;
        System.out.println("Enter an integer ");
        n=sc.nextInt();
        for(fact=1;1<=n;n--)
        {
            fact=fact*n;

        }
        System.out.println(fact);
    }
}
