import java.util.Scanner;

public class Acceptingchar1 {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a  character");
        Scanner kb= new Scanner(System.in);
        str=kb.next();
        char ch = str.charAt(0);
        System.out.println("character is"+ch);
    }
}
