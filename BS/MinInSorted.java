package BS;
public class MinInSorted {
    private static int minInSorted(int arr[]){
        int low =0;
        int high =arr.length-1;
        int finalMin = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            int min = mid;
            if(arr[low]<=arr[high]){
                min = arr[low];
                finalMin = Math.min(finalMin, min);
                break;
            }
            if(arr[low]<=arr[mid]){
                min = arr[low];
                finalMin = Math.min(min,finalMin);
                low = mid +1;
            }else if(arr[mid]<=arr[high]){
                min = arr[mid];
                finalMin = Math.min(min,finalMin);
                high = mid -1;
            } 
        }
        return finalMin;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        System.out.println(minInSorted(arr));
    }
}
