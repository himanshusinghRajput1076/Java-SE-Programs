package fileHandling;

import java.io.File;

public class FileEx2 {
    public static void main(String[] args) {
        File myfile = new File("D:/frontend sca/testPaper");
        System.out.println(myfile.getName()+"is present?"+myfile.exists());
        System.out.println(myfile.getName()+"is of "+myfile.length()+"bytes");
        System.out.println(myfile.getName()+"is deleted"+myfile.delete());
        System.out.println(myfile.getName()+"is present"+myfile.exists());
    }
}
