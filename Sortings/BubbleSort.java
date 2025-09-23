package Sortings;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {11,2,3,41,5,6,7,8,9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
