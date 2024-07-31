package argumentpassing;

public class UseSample {
    public static void main(String[] args) {
        Sample S=new Sample();
        S.setData(10,20);
        System.out.println("Before incrementing ");
        S.showData();
        Sample temp=new Sample();
        temp.incrementBy5(S);
        System.out.println("After incrementing ");
        S.showData();
    }
}
