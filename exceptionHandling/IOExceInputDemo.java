package exceptionHandling;
//Unhandled Exceptions -- it can not handle then it can not compile   (handled on throws)
import java.io.IOException;
import java.util.Scanner;

public class IOExceInputDemo {
    public void acceptInput() {
        Scanner kb=new Scanner(System.in);
        int a;
        System.out.println("Enter an Integer ");
        a=kb.nextInt();
        System.out.println("you inputted "+a);
    }
    public void acceptIntChar() throws IOException
     {

        char ch;
        System.out.println("Enter a char :");
        ch = (char) System.in.read();
        System.out.println("you inputted " + ch);

    }

    public static void main(String[] args) throws IOException
     {
        IOExceInputDemo obj=new IOExceInputDemo();
        obj.acceptInput();
        obj.acceptIntChar();

    }
}
