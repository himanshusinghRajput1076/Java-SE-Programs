package basicooprogramming;

public class NewFactC {

    private int facts;

    public void setFact(int n) {
        facts = n;
    }

    public int ShowFact() {


        int f = 1;
      for (int i = facts; i >= 1; i--) {
            int p = 1;
            p = p * i;
            f = f * i;
            System.out.println(p);
        }


        return f;
    }
    }




