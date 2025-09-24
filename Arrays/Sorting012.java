package Arrays;

import java.util.Arrays;

public class Sorting012 {
    private static void sorting012(int arr[]){
       // Arrays.sort(arr);
       int low =0;
       int mid =0;
       int high = arr.length-1;
       while(mid<=high){
        if(arr[mid]==0){
            int temp = arr[mid];
            arr[mid]=arr[low];
            arr[low]=temp;
            low++;
            mid++;
        }else if(arr[mid]==2){
             int temp = arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
        }else if (arr[mid] == 1) {
                mid++;
            } 
       }
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,2,0,0,1,2,1,0,0};
        sorting012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
