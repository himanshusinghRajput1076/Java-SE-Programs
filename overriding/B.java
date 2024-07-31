package overriding;

public class B extends A{
    public void show(int i){
        System.out.println("In show of B with int  argu :"+i);
        super.show(i);
    }
    public void show(String j){
        System.out.println("In show of B with String argu:"+j);


    }
}
