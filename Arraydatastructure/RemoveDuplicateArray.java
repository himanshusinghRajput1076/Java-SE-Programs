package Arraydatastructure;

import java.util.Arrays;

public class RemoveDuplicateArray {
    public static int []removeDuplicates(int []arr){
        Arrays.sort(arr);
        int length=arr.length;
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
            else{
                length--;

            }
        }
        int []result = Arrays.copyOf(arr,length);
        return result;
    }

    public static void main(String[] args) {
        int []array={3,1,4,2,5,3};
        int []uniqueArray=removeDuplicates(array);
        System.out.println("original"+Arrays.toString(array));
        System.out.println("Arrays With removeDuplicate "+Arrays.toString(uniqueArray));
    }
}
