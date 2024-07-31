package methodoverloading;

public class UseDemo {
    public static void main(String[] args) {
        byte b=10;
        short s= 20;
        int n=30;
        char ch='A';
        Demo obj = new Demo();
        obj.show(b);
        obj.show(s);
        obj.show(n);
        obj.show(ch);
       // long x=25;
//obj.show(x);
    }
}
