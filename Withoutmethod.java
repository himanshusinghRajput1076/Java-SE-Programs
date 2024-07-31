import java.util.Scanner;

public class Withoutmethod {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base=kb.nextInt();
        System.out.println("Enter the power:");
        int power=kb.nextInt();
        int res = 0;
        int x=1;
        for(int i=0;i<power;i++)
        {
            res=base*x;
            x=res;

        }
        System.out.println("Result is "+res);
    }

}