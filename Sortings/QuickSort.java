package Sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,7,8,9,4,1,3,65,9,0};
        QuickSortImpl qs = new QuickSortImpl();
        System.out.println(Arrays.toString(qs.quickSort(arr,0,arr.length-1)));
    }
}
class QuickSortImpl{
    public static int[] quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
        return arr;
    }
    private static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int left = low+1;
        int right = high;
        while(left<=right){
            while(left<=high && arr[left]<=pivot){
                left++;
            }
            while (right >=low && arr[right]>pivot) {
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right]=temp;
            }else{
                break;
            }
                
        }
            int temp = arr[low];
            arr[low]=arr[right];
            arr[right]=temp;
            return right;
    }
}
