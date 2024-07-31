package assignment;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,sum=0,x,temp=0;
        String count;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            x=i;
            count=""+i;
            while(x!=0)
            {
                temp=i;
                temp=i;
                int rem=x%10;
                sum=sum+(int)Math.pow(rem,count.length());
                x=x/10;
            }
            if(sum==temp)
                System.out.println(sum);
            sum=0;
        }

    }
}
