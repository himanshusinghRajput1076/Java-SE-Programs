package basicooprogramming;

public class Factorial {
private int fact;
public void setFact(int n){
   fact=n;
}
public int ShowFact() {
    int f = 1;
    for (int i = fact; i >= 1; i--) {
        int p = 1;
        p = p * i;
        f = f * i;
        System.out.println(p);
    }
    System.out.println("factorial is " + f);
      return f;
}

}
