package Arrays;

public class LongestSumSubArray {
    private static void longestSumSubArray(int arr[],int k){
        int largestSubarray = 0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j]; 
                if(sum == k ){
                    int subarray = j-i+1;
                    if(largestSubarray<subarray){
                        largestSubarray=subarray;
                    }
                }
            }
        }
        System.out.println(largestSubarray);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int k = 5;
        longestSumSubArray(arr,k);
    }
}
