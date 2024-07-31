package newfeatureaddtointerface;
public class Triangle implements Figure{
 private int b,h;

    @Override
    public void area() {
        System.out.println("area of triangle "+0.5*b*h);
    }
    public Triangle(int b, int h){
     this.b=b;
     this.h=h;
 }

}
