package thiskeyword;

public class UseBox {
    public static void main(String[] args) {
        Box obj1 = new Box(10, 20, 30);
        Box obj2 = new Box(15);
        Box obj3 = new Box();
        obj1.show();
        obj2.show();
        obj3.show();
    }
}