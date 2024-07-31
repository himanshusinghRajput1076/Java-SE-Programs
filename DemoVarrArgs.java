public class DemoVarrArgs {

    public static void num(int... a) {

        System.out.println("Number of arguments " + a.length);

        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        num(100);
        num();
        num(1, 2, 3, 4);
        num(1,2,3,4,5,6,7,8,9,7,5,6,7,8);
        num(6567,6,6,5,6,7,8,9,7,6,5 , 1,0,6,6,5,5);
    }
}