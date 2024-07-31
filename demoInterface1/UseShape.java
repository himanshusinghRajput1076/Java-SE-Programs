package demoInterface1;

public class UseShape {
    public static void main(String[] args) {
        Shape s;
        s=new Circle(10);
        System.out.println(" Name of the Shape "+s.getName());
        System.out.println(" its area is "+s.getArea());
        s= new Rectangle(10,20);
        System.out.println(" Name of the Shape "+s.getName());
        System.out.println(" its area is "+s.getArea());
    }
}
