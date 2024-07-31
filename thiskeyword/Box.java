package thiskeyword;

public class Box {
    private int L,B,H;
    public Box(int L,int B,int H){
        this.L=L;
        this.B=B;
        this.H=H;
        }
        public Box(int s){
        this(s,s,s);
        }
        public Box(){
        this(0,0,0);
        }
        public void show(){
            System.out.println("length="+L+"Breadth "+B+"Heigth "+H);
        }
    }

