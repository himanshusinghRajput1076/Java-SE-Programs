package looping;

import java.util.Scanner;

public class WhileEx5 {
    public static void main(String[] args) {
        int n,i=1,sum=0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>=i)
        {
            sum=sum+i;

            i++;
        }
        System.out.println(sum);
    }
}
