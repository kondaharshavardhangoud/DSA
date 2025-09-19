package Sortings;

import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int minIndex =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]) minIndex=j;
            }
            int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,1,3,9,6,4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
