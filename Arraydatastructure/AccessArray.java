package Arraydatastructure;

public class AccessArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("first ele "+arr[0]);
        System.out.println("sec ele "+arr[1]);
        arr[0]=10;
        arr[1]=20;
      //  System.out.println("modifying element "arr[0]);
      //  System.out.println("modifying element "arr[1]);
        for(int element:arr){
            System.out.println(element);
        }
    }
}
