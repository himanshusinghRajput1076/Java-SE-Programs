package demoInterface1;

public class Circle implements Shape {
    private int radius;

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public Circle(int radius ){
        this.radius=radius;

    }

}
