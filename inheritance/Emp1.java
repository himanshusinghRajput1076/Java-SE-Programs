package inheritance;

public class Emp1 {
    //create constructor using in super
    private String name;
    private double sal;
    public Emp1(String name,double sal){
        this.name=name;
        this.sal=sal;
    }
    public String getName(){
     return name;
    }
   public double getsal(){
        return sal;
    }
}
