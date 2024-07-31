package arrayassignment;


public class PairSum {
    public static int PairSum(int [] arr ,int target)
    {
    int count = 0;
    int sum=0;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            sum=arr[i]+arr[j];
            if(sum==target){
                ++count;
            }
        }
    }
        return count;
    }
    public static int betterPairSum(int []arr,int target){
        int count=0;
        int sum=0;
        int start=0,end=arr.length-1;
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            }else if(sum>target){
                end--;

            }else {
                start++;
            }
        }
        return count;
    }


public static void main(String[] args) {
    int []arr={1,2,3,4,5};
    int target;

    System.out.println(PairSum(arr,3));
    System.out.println(betterPairSum(arr,3));
}
}