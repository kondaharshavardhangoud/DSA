package Arrays;

import java.util.Arrays;

public class RotateMatrix90 {
    private static int[][] rotateMatrix90(int arr[][]){
       /* 
       SINCE TAKING BOTH TIME & SPACE COMPLEXITY OF N*N OPTIMIZING USING TRANSPOSE
       int arr1[][] = new int[3][3];
        int j=0;
        while(j<3){
            for(int i=2;i>=0;i--){
                arr1[j][2-i]=arr[i][j];
            }
            j++;
        }
        return arr1;*/ 
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int left = 0;
           int right = n-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotateMatrix90(arr)));
    }
}
