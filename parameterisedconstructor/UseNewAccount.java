package parameterisedconstructor;

public class UseNewAccount {
    public static void main(String[] args) {
        NewAccount obj1;
        obj1= new NewAccount(101,"Deepak" ,50000.0);
        obj1.showNewAccount();
        NewAccount obj2;
        obj2= new NewAccount(102,"Ravi",45000.0);
        obj2. showNewAccount();
    }
}
