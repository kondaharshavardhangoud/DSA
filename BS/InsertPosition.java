package BS;

public class InsertPosition {
    private static void insertPosition(int arr[],int k){
        int low =0;
        int high = arr.length-1;
        int positon =arr.length;
        while (low<=high) {
            int mid=(low+high)/2;
            if(k<=arr[mid]){
                positon = mid;
                high=mid-1;
            }else{
                low = mid +1;
            }
        }
        System.out.println(positon);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        int k = 2;
        insertPosition(arr, k);
    }
}
