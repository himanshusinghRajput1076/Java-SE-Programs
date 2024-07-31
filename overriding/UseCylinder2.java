package overriding;

public class UseCylinder2 {
    public static void main(String[] args) {
        Cylinder2 C2=new Cylinder2(5,7);
        Circle2 C1=new Cylinder2(2,3);
        System.out.println("Radius is "+ ((Cylinder2) C1).volume());
        System.out.println("area of Circle is "+C1.area());
        System.out.println("area of Cylinder is "+((Circle2)C2).area());
        System.out.println("volume is "+C2.volume());
        System.out.println("Area of Cylinder  is "+C2.area());
        System.out.println("Area of Circle  is "+((Cylinder2)C1).area());
    }
}
