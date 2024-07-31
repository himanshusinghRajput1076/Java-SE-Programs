package staticblock;

public class UseAccount {
    public static void main(String[] args) {
        Account obj=new Account(100,"Himanshu",500000);
        Account obj2= new Account(200,"Ajay",8000000);
        obj.showAccount();
        obj2.showAccount();

    }
}
