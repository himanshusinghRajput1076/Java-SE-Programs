package inheritance;

public class UseManager {
    public static void main(String[] args) {
        Manager boss=new Manager();
        boss.setData("Himanshu",50000.0);
        boss.setBonus(25000.0);
        System.out.println("Manager Name "+boss.getname());
        System.out.println(" total Salary "+boss.getIncome());
    }
}
