package BS;

public class UpperBound {
    private static void upperBound(int arr[],int k){
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(k<arr[mid]){
                ans = mid;
                high = mid-1;
            }else{
                low =mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]= {3, 5, 8, 15, 19};
        int k = 9;
        upperBound(arr, k);
    }
}
