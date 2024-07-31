package looping;

import java.util.Scanner;

public class Whileex4 {
    public static  void main(String[] args) {
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        n = sc.nextInt();
        while(n>=i)
        {
             if(n%2==0) {

            System.out.println(n);
              }
            n--;
        }
    }
}
