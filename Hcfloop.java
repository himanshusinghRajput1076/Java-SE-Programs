import java.util.Scanner;

public class Hcfloop {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter first nums");
        int n1=kb.nextInt();
        int n2=kb.nextInt();
        int hcf=0;
        for(int i=1;i<=n1||i<=n2;i++)
        {
            if(n1%i ==0 && n2%i==0)
            {
                         hcf=i;
            }
        }
        System.out.println("HCF :"+hcf);
    }
}
