package looping;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        int n,i=1,sum=0,oddsum=0;
        System.out.println("Enter a Range ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>=i)
        {
            if(i%2==0)
                sum=sum+i;
            else
             oddsum=oddsum+i;
            i++;
        }
        System.out.println("even sum"+sum);
        System.out.println("odd sum"+oddsum);



    }

}
