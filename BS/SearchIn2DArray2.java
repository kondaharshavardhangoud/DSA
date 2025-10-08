package BS;

public class SearchIn2DArray2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
      int i=0;
      int row  = matrix.length-1;
      int col = matrix[0].length-1;
      while(col>=0 && i<=row){
        if(matrix[i][col]==target) return true;
        if(matrix[i][col]>target){
            col--;
        }else if(matrix[i][col]<target){
            i++;
        }
      }
      return false;
    }
    public static void main(String[] args) {
        int mat[][]={{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target = 31;
        System.out.println(searchMatrix(mat, target));
    }
}
