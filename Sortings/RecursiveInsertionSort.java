package Sortings;

import java.util.Arrays;

class RecursiveInsertionSort{
    private static void recursiveInsertionSort(int[] arr,int n,int i){
        // Another way similar to bubble sort but extra looping with i==n-1
        /*if(i==n-1){
            recursiveInsertionSort(arr, n-1,0);
            return;
        }*/
        // boolean check = false;
        // int key = arr[i+1];
        // int j= i;
        // while(j>=0 && arr[j]>key){
        //     arr[j+1]=arr[j];
        //     j--;
        // }
        // arr[j+1]=key;
        // recursiveInsertionSort(arr, n, i+1);
    }

    private static void recursiveInsertionSortOriginal(int arr[],int n){
        if(n<=1) return;
        recursiveInsertionSortOriginal(arr, n-1);
        int last = arr[n-1];
        int i = n-2;
        while(i>=0 && arr[i]>last ){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=last;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,5,3,1,2,4,6,8,0};
     //   recursiveInsertionSort(arr,arr.length,0);
        recursiveInsertionSortOriginal(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}