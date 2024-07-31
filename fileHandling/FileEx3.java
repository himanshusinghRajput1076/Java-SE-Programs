package fileHandling;

import java.io.File;
import java.util.Date;

public class FileEx3 {
    public static void main(String[] args) {
        File myfile =new File("D:/frontend sca/testPaper");
        long ms=myfile.lastModified();
        System.out.println("file was mod on "+ms);
        Date d=new Date(ms);
        System.out.println("the above time is "+d);
    }
}
