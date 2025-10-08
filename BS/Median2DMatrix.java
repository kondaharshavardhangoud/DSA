package BS;

public class Median2DMatrix {
    public int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int k = (m*n)/2;
        for(int i=0;i<n;i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high,matrix[i][m-1]);
        }
        while (low<=high) {
            int mid = (low+high)/2;
            int desire = smallEqual(matrix,mid);
            if(desire<k){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
      return low;
      }
      private int smallEqual(int matrix[][],int mid){
        int count =0;
        for(int i=0;i<matrix.length;i++){
            count += upperBound(matrix[i], mid);
        }
        return count;
      }

    private int upperBound(int[] matrix, int mid) {
        int low =0;
        int high = matrix.length-1;
        int ans =-1;
        while (low<=high) {
            int newMid = (low+high)/2;
            if(matrix[newMid]>mid){
                ans = newMid;
                high = newMid-1;
            }else{
                low = newMid+1;
            }

        }
      return ans == -1 ? matrix.length : ans;
    }
    public static void main(String[] args) {
        Median2DMatrix mt = new Median2DMatrix();
        int mat[][] = {{1, 4, 9},{2, 5, 6},{3, 7, 8}};
        System.out.println(mt.findMedian(mat));
    }
}
