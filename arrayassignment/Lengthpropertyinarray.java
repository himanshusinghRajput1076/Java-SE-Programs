package arrayassignment;

import java.util.Scanner;

public class Lengthpropertyinarray {
    public static void main(String[] args) {
        int n,sum=0;
       // Scanner sc = new Scanner(System.in);
        n=args.length;

        if(n<=1)
        {
            System.out.println("Please enter atleast 2 number ");
            System.exit(0);
        }
        for(int i=0;i<n;i++)
            sum=sum+Integer.parseInt(args[i]);

        System.out.println("sum is "+sum);
    }
}
