package forloop;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n,i;
        System.out.println("Enter an integer ");
        n=sc.nextInt();
        for(i=1;i<=19;i++) {
            if (i == 10||i==12)
                continue;

            System.out.println(i);
        }
        }
}
