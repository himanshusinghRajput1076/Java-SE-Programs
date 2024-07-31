package argumentpassing;

import java.util.Scanner;

public class Distance {
  private  int  inches;
  private  int  feets;

    public void setDistance(int feet,int inch){
        inches=inch;
        feets=feet;
    }
    public void showDistance(){
        System.out.println(" feet is "+feets+"inches is "+inches);
    }
    public void addDistance(Distance first,Distance second){
//        Distance d1=(Distance)first;
//        Distance d2=(Distance) second;
        System.out.println("add the distance of feet "+(first.feets+second.feets));
        System.out.println("add the distance of inch "+(first.inches+second.inches));

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Distance d1=new Distance();
        d1.setDistance(10,20);
        Distance d2=new Distance();
        d2.setDistance(30,40);
        Distance d3=new Distance();
        d3.addDistance(d1,d2);
    }
}
