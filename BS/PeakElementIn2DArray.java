package BS;

import java.util.Arrays;

public class PeakElementIn2DArray {
    public int[] findPeakGrid(int[][] mat) {
      int row = mat.length-1;
      int col = mat[0].length-1;
      int low =0;
      int high = col;
      while(low<=high){
        int mid = (low+high)/2;
        int r = maxElement(mat,mid);
        int left = mid-1>=0 ? mat[r][mid-1]:Integer.MIN_VALUE;
        int right = mid+1<=col ? mat[r][mid+1]:Integer.MIN_VALUE;
        if(left<mat[r][mid] && mat[r][mid]>right){
          return new int[]{r,mid};
        }
        if(left>mat[r][mid]){
          high = mid-1;
        }else{
          low=mid+1;
        }
      }
      
      return new int[]{-1,-1};
    }
    private int maxElement(int[][] mat, int mid) {
        int len = mat.length;
        int maxVal = Integer.MIN_VALUE;
        int max = -1;
        for(int i=0;i<len;i++){
            if(mat[i][mid]>maxVal) {
              maxVal = mat[i][mid];
              max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][]={{10, 20, 15},{21, 30, 14},{7, 16, 32}};
        PeakElementIn2DArray pk = new PeakElementIn2DArray();
        System.out.println(Arrays.toString(pk.findPeakGrid(arr)));
    }
}
