package staticblock;

public class Demo {
    public Demo() {
        System.out.println("Constructor called ,...:");
    }

    static {
        System.out.println("static block called...");
    }
    public static void show(){
        System.out.println("Show called...");
    }
}
   class UseDemo{
       public static void main(String[] args) {
           Demo D1= new Demo();
           Demo D2= new Demo();
           Demo.show();
       }
}
