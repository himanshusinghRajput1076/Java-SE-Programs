package arrayassignment;
import java.util.Arrays;
import java.util.Scanner;

public class FindSecLargestIntArray {
    public static int Secondlargest(int [] arr) {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;
    }
      public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
       int arr[]= new int[0];
        System.out.println("Enter a array size");
        size=sc.nextInt();

        for(int i=0;i<=size;i++)
        {
            System.out.println("Enter an integer");
            arr[i]=sc.nextInt();
        }
        System.out.println(Secondlargest(arr));
    }
}
