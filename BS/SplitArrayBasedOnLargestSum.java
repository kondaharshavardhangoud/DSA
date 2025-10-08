package BS;

public class SplitArrayBasedOnLargestSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int m = 3;
        System.out.println(splitArray(arr, m));
    }

  /*   private static int splitArray(int[] arr, int m) {
        int low =0;
        int high = 0;
        for(int a : arr){
            if(a>low) low = a;
            high+=a;
        }
        for(int i =low;i<=high;i++){
            if(possible(arr,i,m)<=m){
                return i;
            }
        }
        return -1;
    }*/

    // Optimal solution
    private static int splitArray(int[] arr, int m) {
        int low =0;
        int high = 0;
        int ans = 0;
        for(int a : arr){
            if(a>low) low = a;
            high+=a;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(arr, mid)<=m){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    private static int possible(int[] arr, int i) {
        int numberOfArrays =1;
        int sum =0;
        for(int a : arr){
            if(sum+a>i){
                numberOfArrays++;
                sum = a;
            }else{
                sum+=a;
            }
        }
        return numberOfArrays;
    }
}
