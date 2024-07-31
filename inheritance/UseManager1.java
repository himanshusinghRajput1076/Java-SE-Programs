package inheritance;

public class UseManager1 {
    public static void main(String[] args) {
        Manager1 boss1=new Manager1("himanshu",50000.0,25000.0);
        Manager1 boss2=new Manager1("Ajay",60000.0,30000.0);
        System.out.println("Detailed of boss1 ");
        System.out.println("Manager name "+boss1.getName());
        System.out.println(boss1.getName()+" manager Total income "+boss1.getIncome());

        System.out.println("\nDetailed of boss2");
        System.out.println("Manager name "+boss2.getName());
        System.out.println(boss2.getName()+" Manager Total Income "+boss2.getIncome());
    }
}
