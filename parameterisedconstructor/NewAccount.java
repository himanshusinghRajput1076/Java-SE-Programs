package parameterisedconstructor;

public class NewAccount {

        private int accId;
        private String name;
        private double balance;
        public NewAccount(int id,String str,double bl){
            accId=id;
            name=str;
            balance=bl;
            System.out.println("Account Created...");
        }
        public void showNewAccount(){
            System.out.println("acc no. "+accId+", name "+name+", bal "+balance);

        }
    }
