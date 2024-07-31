package parameterisedconstructor;

import java.io.OptionalDataException;
import java.util.Scanner;

public class UseArrayAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayAccount []arr = new ArrayAccount[2];

        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Enter id , name , balance ");
            int id=sc.nextInt();
            String str = sc.next();
            double balance = sc.nextDouble();
            arr[i]=new ArrayAccount(id,str,balance);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i].showArrayAccount();
        }
    }
}//for(ArrayAccount:arr)
//{x.showArrayAccount();}
