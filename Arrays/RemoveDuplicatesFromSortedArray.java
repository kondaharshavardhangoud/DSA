package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    private static void removeDuplicatesFromSortedArray(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int k=j+1;k<arr.length;k++){
            arr[k]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,4,4,4};
        removeDuplicatesFromSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
