package staticmethod;

public class MyMath {
    public static void add(int a ,int b){
        int c=a+b;
        System.out.println("sum of "+a+"+"+b+" is "+c);
    }
    public static void max(int a, int b){
        if(a>b)
            System.out.println("Gr no is "+a);
        else if(b>a){
            System.out.println("Gr no is "+b);
        }
        else{
            System.out.println("Equal");
        }
    }

    public static void main(String[] args) {
        MyMath.add(10,5);
        MyMath.max(7,8);
    }
}
