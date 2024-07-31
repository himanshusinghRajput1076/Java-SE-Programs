package argumentpassing;

public class Calculator {
   public int Calculate(int []brr){
        int sum=0;
        for(int x:brr){
            sum=sum+x;
        }
       // System.out.println(sum);
        return sum;
    }
    }

