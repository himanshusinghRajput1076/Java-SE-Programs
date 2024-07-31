package forloop;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int i,n,sum=0;
        System.out.println("Enter an integer ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
