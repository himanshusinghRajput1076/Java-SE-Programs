package nestedloop;

public class Example1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            for(int j=10;j<=15;j++)
                System.out.print(j+" ");
            System.out.println();
        }

    }
}
