package methodoverloading;

public class UseMoverLoading {
    public static void main(String[] args) {
        MoverLoading obj=new MoverLoading();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add("good","Morning");
    }
}
