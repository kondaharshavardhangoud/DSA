package Sortings;

import java.util.Arrays;

public class InsertionSort {
    private static int[] inesertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;//for optimization
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,2,4,6,9,1};
        System.out.println(Arrays.toString(inesertionSort(arr)));
    }
}
