package overriding;

public class Circle2 {
    private  int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }

    public Circle2(Circle2 p) {
        radius = p.radius;
    }


    public  int getradius() {
        return radius;

    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

