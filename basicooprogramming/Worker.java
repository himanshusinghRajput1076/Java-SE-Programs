package basicooprogramming;

public class Worker {
    private int Hw;
    private double payRate;
    public void  setData(int n ,double m){
        Hw=n;
        payRate=m;
    }
    public double getSalary(){
        double salary;
   if(Hw>40){
       salary=payRate+payRate;
   }
   else
   {
    salary = Hw*payRate;
   }
      // System.out.println("worker salary"+salary);
   return salary;
    }

}
