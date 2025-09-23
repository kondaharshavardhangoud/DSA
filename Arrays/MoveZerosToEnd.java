package Arrays;

import java.util.*;
public class MoveZerosToEnd {
    private static void moveZerosToEnd(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
             arr[temp]=arr[i];
             temp++;
           }
        }
        for(int i=temp;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,0,4,0,5,0,56,7};
        moveZerosToEnd(arr);    
        System.out.println(Arrays.toString(arr));
    }
}
