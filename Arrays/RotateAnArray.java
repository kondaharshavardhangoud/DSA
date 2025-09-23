package Arrays;
import java.util.*;

public class RotateAnArray {
    private static void rotateAnArray(int arr[]){
        int rotateByPlace =4;
        int low=0;
        int high=arr.length-1;
        rotate(arr,low,rotateByPlace-1);
        rotate(arr,rotateByPlace,high);
        rotate(arr,low,high);
    }
    private static void rotate(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        rotateAnArray(arr);   
        System.out.println(Arrays.toString(arr));
     }
}
