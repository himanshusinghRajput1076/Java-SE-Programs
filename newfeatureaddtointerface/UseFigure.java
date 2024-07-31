package newfeatureaddtointerface;

import java.util.Scanner;

public class UseFigure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Figure.welcomeMessage();
        System.out.println("Select a figure ");
        System.out.println("1.triangle\n2.cylinder ");
        int choice=sc.nextInt();
        Figure f=null;
        if(choice==1){
            System.out.println("Enter base and height of triangle");
            int base=sc.nextInt();
            int height=sc.nextInt();
            f= new Triangle(base,height);

        } else if (choice==2) {
            System.out.println("Enter rad and height of cylinder ");
            int rad=sc.nextInt();
            int height=sc.nextInt();
            f=new Cylinder(rad,height);
        }
        else{
            System.out.println("Wrong choice");
            System.exit(0);
        }
        f.area();
        f.volume();
    }

}
