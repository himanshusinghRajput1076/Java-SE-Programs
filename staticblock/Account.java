package staticblock;

import java.util.Scanner;

public class Account {
    private double accId;
    private String names;
    private double balance;
    private static double rateOfInt;
    static {
        System.out.println("Enter rate of Int:");
        Scanner sc= new Scanner(System.in);
        rateOfInt=sc.nextDouble();
    }

    public Account(int id,String name,double bal){

        accId=id;
        names=name;
        balance=bal;
        System.out.println("Costructor called...");
    }
    public void showAccount(){
        System.out.println("Id "+accId);
        System.out.println("name "+names);
        System.out.println("balance "+balance);
    }
}
