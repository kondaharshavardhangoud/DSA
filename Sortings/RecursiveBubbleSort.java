package Sortings;

import java.util.Arrays;

class RecursiveBubbleSort{
    private static void recursiveBubbleSort(int[] arr,int i,int n){
        if(n==1) return;
       if(i==n-1){
             recursiveBubbleSort(arr,0,n-1);
            return;
        }
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]=temp;
        }
        recursiveBubbleSort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,2,8,9,0,2,3,22};
        recursiveBubbleSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}