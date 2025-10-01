package BS;

public class CountNumber {
    private static int first(int arr[],int target){
        int low =0;
        int high = arr.length-1;
        int first =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                first = mid;
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }
     private static int last(int arr[],int target){
        int low =0;
        int high = arr.length-1;
        int last =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                last = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return last;
    }

    private static int countNumber(int arr[],int target){
       int firstIndex = first(arr, target);
         if (firstIndex == -1) return 0;
       int lastIndex = last(arr, target);
       int count = lastIndex-firstIndex+1;
       return count;
    }
    public static void main(String[] args) {
        int arr[]={0, 0, 1, 1, 1, 2, 3};
        int target=2;
        System.out.println(countNumber(arr, target));
    }
}
