package methodoverloading;

public class MoverLoading {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("sum of"+a+","+b+"is"+c);
    }
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("sum of"+a+","+b+","+c+"is"+d);
    }
    public void add(String s1,String s2){
        String s3=s1+s2;
        System.out.println("first String "+s1);
        System.out.println("Sec String "+s2);
        System.out.println("their String "+s3);
    }
}
