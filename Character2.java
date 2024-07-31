import java.util.Scanner;

public class Character2{
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a  character");
        Scanner kb= new Scanner(System.in);
        char ch = kb.next().charAt(0);
        System.out.println("character is"+ch);
    }
}

