 package Practicle2;

 import java.util.Scanner;

 import static java.lang.Math.pow;

 public class Ex3 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=sc.nextInt();
        String count;
        int org=n, r;
        for(int i=1;i<n;i++) {

        //    r =  count""+i;

            r = n % 10;
         //   sum = sum + pow(r,count.length());
            n= n / 10;
        }
            System.out.println("armstrong num"+sum);

    }
}
//que wap to accept decimal num from the user and convert in tobinary
//binary convert to decimal
//prime 1 to 100