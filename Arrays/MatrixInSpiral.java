package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixInSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lt = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left =0;
        int right = m-1;
        int top =0;
        int bottom = n-1;
        while(top <= bottom && left<=right){
            for(int i=left;i<=right;i++){
                lt.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                lt.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int l=right;l>=left;l--){
                    lt.add(matrix[bottom][l]);
                }
                bottom--;
            }
            if(left<=right){
                for(int k=bottom;k>=top;k--){
                    lt.add(matrix[k][left]);
                }
                left++;
            }
        }
         return lt;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        MatrixInSpiral m = new MatrixInSpiral();
        System.out.println(m.spiralOrder(arr));
    }
}
