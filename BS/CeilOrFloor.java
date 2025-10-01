package BS;

import java.util.Arrays;

public class CeilOrFloor {
    private static int ceil(int arr[],int target){
        int low =0;
        int high=arr.length-1;
        int ceil = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= target){
                ceil = arr[mid];
                high = high-1;
            }else{
                low = low+1;
            }
        }
        return ceil;
    }
     private static int floor(int arr[],int target){
        int low =0;
        int high=arr.length-1;
        int floor = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] <= target){
                floor = arr[mid];
                low = low+1;
            }else{
                high = high-1;
            }
        }
        return floor;
    }
    private static int[] ceilOrFloor(int arr[],int target){
        int f = floor(arr, target);
        int c = ceil(arr, target);
        return new int[]{f,c};
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 4, 7, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(ceilOrFloor(arr,target)));
    }
}
