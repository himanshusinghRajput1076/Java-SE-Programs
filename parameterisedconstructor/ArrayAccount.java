package parameterisedconstructor;

public class ArrayAccount {
        private int accId;
        private String name;
        private double balance;
        public ArrayAccount(int id,String str,double bl){
            accId=id;
            name=str;
            balance=bl;
            System.out.println("Account Created...");
        }


    public void showArrayAccount(){
            System.out.println("acc no. "+accId+", name "+name+", bal "+balance);

        }
    }


