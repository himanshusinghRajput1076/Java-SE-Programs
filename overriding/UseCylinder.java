package overriding;

public class UseCylinder {
    public static void main(String[] args) {
        Cylinder obj=new Cylinder(5,7);
        System.out.println("Cylinder's area "+obj.area());
        System.out.println("Cylinder volume "+obj.volume());
        System.out.println("Cylinder Circular part area "+obj.getCircleArea());
    }
}
