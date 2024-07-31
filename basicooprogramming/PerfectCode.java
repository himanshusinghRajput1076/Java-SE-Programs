package basicooprogramming;

import java.util.Scanner;

public class PerfectCode<roll> {
    private int roll;
    private String name;
    private double per;
    public void setData(int r,String Str,double pr)
    {

        roll= r;
        name = Str;
        per=pr;


    }
    public void showData(){
        System.out.println(roll+","+name+","+per);
    }
}
class UseStudent
{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter roll , grade and per :");
        int r=kb.nextInt();
        String Str=kb.next();
        double pr=kb.nextDouble();
        Student s=new Student();
        s.setData(r,Str,pr);
        s.showData();
    }
}
