package polymorphism;

public class UseAB {
    public static void main(String[] args) {
        A ref;
        ref=new A();
        ref.display();
        ref.show();

        ref=new B();
        ref.display();
        ref.show();

    }
}
