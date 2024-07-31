package argumentpassing;

import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {
        Account A1 = new Account();
        Account A2 = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details(accid,name,and balance)of first Account");
        int id = sc.nextInt();
        String str = sc.next();
        double bl = sc.nextDouble();
        A1.setAccount(id, str, bl);
        System.out.println("Enter Details(accId,name,and balance)of Sec.Account");
        id = sc.nextInt();
        str = sc.next();
        bl = sc.nextDouble();
        A2.setAccount(id, str, bl);
        System.out.println("before transfering ");
        A1.showAccount();
        A2.showAccount();
        System.out.println("Enter the amt to transfer");
        double amt = sc.nextDouble();
        A1.transfer(A2,amt);
        System.out.println("After transferring ");
        A1.showAccount();
    }
}