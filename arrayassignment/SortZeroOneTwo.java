package arrayassignment;

import java.util.Arrays;

public class SortZeroOneTwo {
    public static void SortZeroOneTwo(int []arr){
        int left=0,right=arr.length-1;
        int current=0;
        int temp;
        while(current<=right){
            if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                   current++;
            }else if(arr[current]==2){
                temp=arr[current];
                arr[current]=arr[right];
                arr[right]=temp;
                right--;
            }else
                current++;
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,2,1,0};
        SortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));

    }
}
