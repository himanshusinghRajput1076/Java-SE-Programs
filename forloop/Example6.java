package forloop;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n,sum=0;
        System.out.println("Enter an integer ");

        for(;;) {
            n=sc.nextInt();
            if (n==0)
                break;
            if(n<0)
                continue;
             sum=sum+n;

        }
        System.out.println(sum);

    }
}
