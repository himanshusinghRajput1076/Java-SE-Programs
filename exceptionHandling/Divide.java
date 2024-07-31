package exceptionHandling;

public interface Divide {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println("div is " + c);
        }catch(ArithmeticException ex ){
            System.out.println("input  denominator non zero value ");
        }
    }
}
