package BS;
public class FindArrayRotated {
    private static int findArrayRotated(int arr[]){
        int low =0;
        int high =arr.length-1;
        int index=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int min = mid;
            if(arr[low]<=arr[high]){
                index = low;
                break;
            }
            if(index == -1 && arr[low]<=arr[mid]){
                index = low;
                low = mid +1;
            }else if(index == -1 && arr[mid]<=arr[high]){
                index = mid;
                high = mid -1;
            } 
        }
        return index;
    }
    public static void main(String[] args) {
       int arr1[] = {4, 5, 6, 7, 1, 2, 3};
        int arr2[] = {3, 4, 5, 1, 2};
        int arr3[] = {11, 13, 15, 17};
        int arr4[] = {2, 1};

        System.out.println(findArrayRotated(arr1)); // 4
        System.out.println(findArrayRotated(arr2)); // 3
        System.out.println(findArrayRotated(arr3)); // 0
        System.out.println(findArrayRotated(arr4)); // 1
    }
}
