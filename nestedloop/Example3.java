package nestedloop;

public class Example3 {
    public static void main(String[] args) {
        first:
        for(int i=1;i<=4;i++) {
            for (int j = 10; j <= 15; j++) {
                if (i % 2 == 0)
                    break first;
                System.out.print(j+" ");
                System.out.println(" ");
            }
        }

        System.out.print("stop");

    }
}
