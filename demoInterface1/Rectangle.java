package demoInterface1;
public class Rectangle  implements Shape{
    private int l,b;

    @Override
    public double getArea() {
        return l*b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;

    }
}
