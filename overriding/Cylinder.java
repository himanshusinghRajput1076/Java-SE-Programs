package overriding;

public class Cylinder extends Circle{
    int height;
    public Cylinder(int rad,int height){
        super(rad);
        this.height=height;
    }
    public double area(){
        return 2*super.area()+2*Math.PI*getRad()*height;
    }
    public double volume(){
        return super.area()*height;
    }
    public double getCircleArea(){
        return super.area();
    }
}
