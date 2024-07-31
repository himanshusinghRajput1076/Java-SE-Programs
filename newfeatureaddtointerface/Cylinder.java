package newfeatureaddtointerface;
public class Cylinder implements Figure{
   private int height ,rad;

   @Override
   public void area() {
      System.out.println("Area of Cylinder is "+2*Math.PI*Math.pow(rad,2)+(2*Math.PI*Math.pow(rad,2)));
   }

   @Override
   public void volume() {
      System.out.println("vol of Cylinder is "+Math.PI*Math.pow(rad,2*height));
   }

   public Cylinder(int height, int rad){
       this.height=height;
       this.rad=rad;
   }

}
