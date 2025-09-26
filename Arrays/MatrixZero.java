package Arrays;

import java.util.Arrays;

public class MatrixZero {
   /*  private static int[][] matrixZero(int arr[][]){
        int n = arr.length;
         int m = arr[0].length;
        boolean[] row =new boolean[n];
        boolean[] col =new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i] =true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] || col[j]){
                   arr[i][j]=0;
                }
            }
        }
        return arr;
    }*/
    private static int[][] matrixZeros(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        boolean firstCoulmsZero = false;
        boolean firstRowZero = false;
        for(int i=0;i<n;i++){
            if(arr[i][0]==0) firstCoulmsZero = true; 
        }
        for(int j=0;j<m;j++){
            if(arr[0][j]==0) firstRowZero = true; 
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(arr[i][0]==0 || arr[0][j]==0){
                arr[i][j]=0;
            }
        }
    }
        if(firstCoulmsZero){
            for(int i=0;i<n;i++) arr[i][0]=0;
        }
        if(firstRowZero){
            for(int j=0;j<m;j++) arr[0][j]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
      System.out.println(Arrays.deepToString(matrixZeros(arr)));

    }
}
