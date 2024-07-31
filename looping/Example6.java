package looping;
 import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        int n,i=1,sum=0;
        //only even  number to add
        System.out.println("Enter a number range");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>=i){
            if(i%2==0)
            {
                sum=sum+i;

            }
            i++;
        }
        System.out.println("sum of even numbers is"+sum);
    }
}
