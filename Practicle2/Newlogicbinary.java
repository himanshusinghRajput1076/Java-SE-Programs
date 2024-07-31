package Practicle2;

import java.util.Scanner;

public class Newlogicbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int dec=sc.nextInt();
        int []arr=new int[5];
        int i;
        for(i=0;dec>0;i++){
            int rem=dec%2;
            arr[i]=rem;
            dec=dec/2;
        }
        for(i--;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
