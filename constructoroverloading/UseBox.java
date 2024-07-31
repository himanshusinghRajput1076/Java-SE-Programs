package constructoroverloading;


public class UseBox {
    public static void main(String[] args) {
        Box B1,B2,B3,B4;
        B1=new Box();
        B2=new Box(10);
        B3=new Box(5,7,9);
        B4=new Box(B3);//DeepCopy
        B1.show();
        B2.show();
        B3.show();
        B4.show();
    }//B4=B3==Shallow copy//
}