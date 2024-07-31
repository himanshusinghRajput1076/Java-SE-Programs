package argumentpassing;

import java.util.Scanner;

public class Calculator1 {
    public double []Calculate1(int []brr) {
        double[] result = new double[2];
        int sum = 0;
        for (int x : brr) {
            sum = sum + x;
        }
        result[0]=sum;
        result[1]=(double)sum/brr.length;
        return result;
    }

    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
     for(int i=0;i<arr.length;i++){
         System.out.println("Enter no :"+(i+1));
         arr[i]=sc.nextInt();
     }
     Calculator1 obj=new Calculator1();
    double crr[]= obj.Calculate1(arr);
        System.out.println(crr[0]+" "+crr[1]);

    }
}
