package staticmethod;

import staticmethod.Emp;

public class Emp2 {

    int age;
    String name;

    public static int count = 0;

    public Emp2(int a, String n) {
        age = a;
        name = n;
        ++count;
    }


    void ShowEmp() {
        System.out.println("name=" + name + ",age=" + age);

    }

    void ShowCount() {
        System.out.println("total Emp Working currently=" + count);
    }

    protected void finalize() {
        --count;
    }

     static void main(String[] args) {
      Emp2 e= new Emp2(22,"Himanshu");
      Emp2 f=new Emp2(23,"Ajay");
      Emp2 g=new Emp2(26,"priya");
      e.ShowEmp();
      f.ShowEmp();
      g.ShowEmp();

      e.ShowCount();
      {
             Emp x=new Emp(24,"Payal");
             Emp y=new Emp(18,"raj");
             x.ShowEmp();
             y.ShowEmp();
             x.ShowCount();
             x=y=null;
             System.gc();
             System.runFinalization();

         }
       e.ShowCount();
    }
}