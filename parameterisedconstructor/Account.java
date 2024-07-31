package parameterisedconstructor;

public class Account {
    private int accId;
    private String name;
    private double balance;
    public Account(){
        accId=101;
        name="Deepak";
        balance=50000.0;
        System.out.println("Account Created...");
    }
    public void showAccount(){
        System.out.println("acc no. "+accId+", name "+name+", bal "+balance);

    }
}
