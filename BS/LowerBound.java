package BS;

public class LowerBound {
    private static void lowerBound(int arr[],int k){
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=k){
                ans = mid;
                high = mid-1;
            }else{
                low = low+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]= {3, 5, 8, 15, 19};
        int k = 9;
        lowerBound(arr, k);
    }
}
