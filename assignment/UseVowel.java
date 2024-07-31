package assignment;

import java.util.Scanner;

public class UseVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        String name= sc.next();

        int i=0;
        while(i<name.length())
        {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                ch='x';
            }
            System.out.print(ch);
                i++;
        }

    }
}
