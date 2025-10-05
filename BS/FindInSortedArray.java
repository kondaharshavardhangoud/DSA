package BS;
public class FindInSortedArray {
    private static int findInSortedArray(int arr[],int target){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            // for duplicate edge case
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            // for duplicate above check 

            if(arr[mid]>=arr[low]){
                if(target>=arr[low] && target<arr[mid]){
                    high = mid -1;
                }else {
                    low = mid+1;
                }
                
            }else if(arr[mid]<=arr[high] ){
                if(target>arr[mid] && target<=arr[high]){
                     low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target =3;
        int k = findInSortedArray(arr, target);
        if(arr[k]==target){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
