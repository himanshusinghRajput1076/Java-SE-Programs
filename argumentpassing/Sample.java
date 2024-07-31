package argumentpassing;

public class Sample {
    private int a;
    private int b;
    public void setData(int i,int j){
        a=i;
        b=j;
    }
    public void showData(){
        System.out.println("a="+a+"b="+b);
    }
    public void incrementBy5(Sample p){
        p.a=p.a+5;
        p.b=p.b+5;
    }

    public void incrementBy6(Sample s) {

    }
}
