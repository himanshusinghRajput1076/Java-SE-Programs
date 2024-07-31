package forloop;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int i,n;
        System.out.println("Enter an integer ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
