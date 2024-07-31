package basicooprogramming;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HourWorked;
        double payRate;
        System.out.println("Enter hours and salary");
        HourWorked=sc.nextInt();
        payRate=sc.nextDouble();
        Worker obj=new Worker();
        obj.setData( HourWorked,payRate);
        double Show;
        Show=obj.getSalary();
        System.out.println(Show);
    }
}
