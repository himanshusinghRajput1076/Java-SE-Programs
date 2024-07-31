package Arraydatastructure;

public class AddToArray {
    public static void main(String[] args) {
        int []array1={1,2,3,4,5,0};
        int []array2={6,7,8,9,10,11};
        if(array1.length!=array2.length){
            System.out.println("the array must have the same length to be added");
            return ;
        }
        int []sumArray=new int [array1.length];
        for(int i=0;i<array1.length;i++){
            sumArray[i]=array1[i]+array2[i];

        }
        System.out.println("resultant Array");
        for(int i=0;i<sumArray.length;i++){
            System.out.println(sumArray[i]+" ");
        }
    }
}
