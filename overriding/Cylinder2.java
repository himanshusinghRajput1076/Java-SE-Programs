package overriding;

public class Cylinder2 extends Circle2{
    private int height;
    public Cylinder2(int radius,int height){
        super(radius);
        this.height=height;
    }
    public Cylinder2(Cylinder2 q){
        super(q);
        this.height=q.height;
    }

    public double area() {
        return 2*super.area()+2*Math.PI*getradius()*height;
    }
    public double volume(){
        return super.area()*height;
    }
}
