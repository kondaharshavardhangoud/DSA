package Arrays;
import java.util.*;

public class TwoPointer {
    private static void twoPointer(int arr[],int k){
        int sum=0;
        int maxLen=0;
        int left =0;
        int start =-1;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                if(maxLen<right-left+1){
                    maxLen = right-left+1;
                    start =left;
                }
            }
        }
        System.out.println(maxLen);
        for(int i=start;i<start+maxLen;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,3,5,6,2,1};
        int k=22;
        twoPointer(arr,k);
    }
}
