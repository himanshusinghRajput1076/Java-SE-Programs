package argumentpassing;

public class NewSample {
    private int a;
    private int b;
    public void setData(int k,int j){
        a=k;
        b=j;
    }
    public void showData(){
        System.out.println("a="+a+"b="+b);
    }
    public void incrementBy6(NewSample p){
        p=new NewSample();
        p.a=p.a+6;
        p.b=p.b+6;
    }
}
