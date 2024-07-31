package Practicle2;

import java.util.Scanner;

public class Ex4 {
 //   que wap to accept decimal num from the user and convert in to binary
 public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int show;
   int   decimalnum = 0;
     String binary="";

  System.out.println("Enter a num:");
     decimalnum=sc.nextInt();
    int n=decimalnum;

  for(int i=0;i<decimalnum; ){
     show=decimalnum%2;
    binary=show+binary;
    decimalnum/=2;
   }

     System.out.println("binary represents   "+n+"  is  "+binary);

 }
}
