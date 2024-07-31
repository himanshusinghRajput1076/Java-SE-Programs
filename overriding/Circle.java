package overriding;

public class Circle {
    private int rad;
    public Circle(int rad) {
        this.rad = rad;
    }
        public double area(){
            return Math.PI*Math.pow(rad,2);
    }

    public int getRad() {
        return rad;
    }
}

