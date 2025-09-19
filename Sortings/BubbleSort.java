package Sortings;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
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
