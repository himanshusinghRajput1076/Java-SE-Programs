package demoInterface2;
////THIS IS CHILD CLASS OF THE CLASSES and INHERIT THE FEATURE OF MY SHAPE
//THAT MEANS SHAPE AND FIGURE INTERFACES FEATURE
/// AND ITS CREATE OWN RECTANGLE CLASS ALSO;
public class Rectangle implements Myshape{
    private int l,b;

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return l*b;
    }

    public Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }

}
