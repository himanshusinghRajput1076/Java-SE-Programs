package Arraydatastructure;

import java.util.Arrays;

public class Method2SortArray {
    public static void main(String[] args) {
        int []arr={9,4,5,3,2,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++) {
                if(arr[i]>arr[j]){//change <,>in your choice to accessending or decessending
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
