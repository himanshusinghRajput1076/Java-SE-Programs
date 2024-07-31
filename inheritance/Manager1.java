package inheritance;

public class Manager1 extends Emp1 {
    private double bonus;

    public Manager1(String name, double sal,double bonus) {
        super(name, sal);
        this.bonus=bonus;
    }
    public double getIncome(){
        double income;
        income=getsal()+bonus;
        return income;
    }
}
