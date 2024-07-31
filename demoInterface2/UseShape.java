package demoInterface2;
///USE PARENT CLASS== WE ALSO USE A FIGURE THATS YOUR CHOICE OR SHAPE
public class UseShape {
    public static void main(String[] args) {
        Myshape s;
       s =new Circle(10);
        System.out.println("Name of the shape is "+s.getName());
        System.out.println("Its area"+s.getArea());
        s=new Rectangle(10,20);
        System.out.println("Name of the shape is "+s.getName());
        System.out.println("Its area"+s.getArea());
    }
}
