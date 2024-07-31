package basicooprogramming;

public class FibonacciS {
    private int fibo=0;
    public void setFibo(int n){
        fibo=n;
    }
    public int Prints() {
        int sum = 0;
        int total = 0;
        for (int i = 0; i <= fibo; i++) {
            sum = sum + i;
           // total = sum + sum;
           System.out.println("series " + sum);


        }
        return sum;
    }
}
