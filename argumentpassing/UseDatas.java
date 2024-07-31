package argumentpassing;

public class UseDatas {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        System.out.println("Before incrementing ");
        System.out.println("i="+i+"j="+j);
        Datas obj=new Datas();
        obj.incrementby5(i,j);
        System.out.println("After incrementing ");
        System.out.println("i="+i+"j="+j);

    }
}
