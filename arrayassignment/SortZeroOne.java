package arrayassignment;

import java.util.Arrays;

public class SortZeroOne {
    public static void SortZeroOne(int []arr) 
    {
    int left =0,right=arr.length-1;
    int temp;
    while(left<right){
        if(arr[left]==1){
            if(arr[right]!=1){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            right--;
        }
        else {
            left++;
        }
    }
        
    }

    public static void main(String[] args) {
        int [] arr={0,1,1,0,1,0,1};
        SortZeroOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
