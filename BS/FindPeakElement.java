package BS;

public class FindPeakElement {
    private static int findPeakElement(int arr[]){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        int low =0;
        int high = n-2;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[low]<=arr[mid]){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(findPeakElement(arr));
    }
}
