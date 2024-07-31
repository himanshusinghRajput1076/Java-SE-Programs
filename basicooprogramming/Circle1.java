package basicooprogramming;

public class Circle1 {

    private int radius;
    public void setradius(int r)
    {
        radius = r;
    }
    public double calArea(){
      double ar=Math.PI*Math.pow(radius,2);
      return ar;
    }
 public  double CalCircumference(){
        double circ = 2*Math.PI*radius;
        return circ;
    }
}
