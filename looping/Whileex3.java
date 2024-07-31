package looping;

import java.util.Scanner;

public class Whileex3 {
    public static  void main(String[] args) {
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        n = sc.nextInt();
        while(n>=i)
        {
             if(i%2==0) {

            System.out.println(i);
              }
            i++;
        }
    }
}
