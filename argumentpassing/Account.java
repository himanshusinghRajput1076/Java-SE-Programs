package argumentpassing;

public class Account {
    private int accId;
    private String name;
    private double balance;
    public void setAccount(int id,String str,double bl){
        accId=id;
        name = str;
        balance = bl;

    }
    public void showAccount(){
        System.out.println(accId+","+name+","+balance);
    }
    public void transfer(Account Q,double amt){
        if(balance-amt<500){
            System.out.println("Transaction declined,insufficient balance");
        } else {
            balance=balance-amt;
            Q.balance=Q.balance+amt;
        }
    }
}
