package inheritance;

public class Manager extends Emp {
    private double bonus;
    public void setBonus(double Bonus){
        this.bonus = Bonus;
    }
    public double getIncome(){
        double income;
        income = getsal()+bonus;
        return income;
    }



}
