package fileHandling;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
     File myfile=new File("D:/frontend sca");
     if(myfile.exists()){
         System.out.println(myfile.getName()+"is present");
     }
     else {
         System.out.println("file not present ");
         System.exit(0);

     }
     if(myfile.isFile())
         System.out.println(myfile.getName()+"isfile");
     else {
         System.out.println(myfile.getName()+"is a directory");
    if(myfile.isHidden())
        System.out.println(myfile.getName()+"isHidden");
     else
        System.out.println(myfile.getName()+"is not hidden");
     if(myfile.canWrite())
         System.out.println(myfile.getName()+"Allows Writing ");
     else {
         System.out.println(myfile.getName()+"does not allow writing ");
       }
     }

    }
}
