package constructoroverloading;

public class Box {
    private int l,b,h;

    public Box(){
        l=b=h=0;
    }
    public Box (int s){
        l=b=h=s;
    }

    public Box(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }
    public Box(Box p){
        l=p.l;
        b=p.b;
        h=p.h;
    }
    public void show(){
        System.out.println("length= "+l+" breadth= "+b+" height= "+h);
    }
}
