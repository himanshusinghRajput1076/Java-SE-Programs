package nestedloop;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
       // Scanner sc = new Scanner(System.in);
        //n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
