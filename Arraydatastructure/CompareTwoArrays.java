package Arraydatastructure;

public class CompareTwoArrays {
    public static boolean arraysEqual(int []arr1,int arr2[]){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []array1={1,3,4,5,6};
        int []array2= {1,3,4,5,6};
        System.out.println(arraysEqual(array1,array2));
    }
}
