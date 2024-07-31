package demoInterface2;
////THIS IS CHILD CLASS OF THE CLASSES and INHERIT THE FEATURE OF MY SHAPE
//THAT MEANS SHAPE AND FIGURE ,,,INTERFACES FEATURE AND CREATE OWN CIRCLE CLASS ALSO;
public class Circle implements Myshape{
    private int radius;

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public Circle(int radius){
        this.radius=radius;
    }

}
