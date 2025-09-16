import java.util.Arrays;

public class ReversingArray {
    private static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        // two pointer solution
        // int left = 0;
        // int right = arr.length-1;
        // while(left<right){
        //     reversedArray[left]=arr[right];
        //     reversedArray[right]=arr[left];
        //     left++;
        //     right--;
        // }

        /*one pass solution */
        for(int i=0;i<arr.length;i++){
            reversedArray[i]=arr[arr.length-1-i];
        }
        return reversedArray;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,7,8,1,0};
        System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
