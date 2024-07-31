package finalKeyword;
import java.time.Clock.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;


public  class Student {
    /*private final int roll;
    private String name;
    private double per;
    private final int MAX_Marks=100;
    public Student(int r, String s, double p) {
        roll = r;
        name = s;
        per  = p;

    }
    public static final int a=0;//what was that
*/
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
       int i=1;
       while(i<101){
           i++;
           System.out.println(i);

        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " milliseconds");
    }
}

