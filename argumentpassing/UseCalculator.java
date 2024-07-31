package argumentpassing;

import java.util.Scanner;

public class UseCalculator {
    public static void main(String[] args) {
        int []arr=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter no :");
            arr[i]=sc.nextInt();

        }
        Calculator obj=new Calculator();
        int Ans;
         Ans =   obj.Calculate(arr);
        System.out.println("Sum is "+Ans);
    }
}
