package staticmethod;

public class Emp {
     int age;
     String name;
     static int count = 0;

    public Emp(int a, String n) {
         age = a;
         name = n;
         ++count;
    }

     public void ShowEmp() {
        System.out.println("name="+name+",age="+age);

    }
     public void ShowCount(){
        System.out.println("total Emp Working currently="+count);
    }


     static void main(String[] args) {
      Emp e= new Emp(22,"Himanshu");
      Emp f=new Emp(23,"Ajay");
      Emp g=new Emp(26,"priya");
      e.ShowEmp();
      f.ShowEmp();
      g.ShowEmp();
      e.ShowCount();

    }
}