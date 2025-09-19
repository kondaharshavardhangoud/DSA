package Sortings;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class MergeSort {

    private static int[]  mergeSort(int arr[],int low,int high){
        if(low>=high) return arr;
        int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
       return arr;
    }
    private static void merge(int[] arr,int low,int mid,int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else if(arr[left]>=arr[right]){
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
    public static void main(String[] args) {
        int arr[]={7,5,1,9,8,6,4,3,5};
        System.out.println(Arrays.toString(mergeSort(arr, 0,arr.length-1)));
    }
}
