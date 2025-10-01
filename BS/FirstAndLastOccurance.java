package BS;

import java.util.Arrays;

public class FirstAndLastOccurance {
    private static int first(int arr[],int target){
        int low =0;
        int high=arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
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
        int high=arr.length-1;
        int last = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return last;
    }
    private static int[] firstAndLastOccurance(int arr[],int target){
        int f = first(arr, target);
        int l = last(arr, target);
        return new int[]{f,l};
    }
    public static void main(String[] args) {
        int arr[]={5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastOccurance(arr,target)));
    }
}
