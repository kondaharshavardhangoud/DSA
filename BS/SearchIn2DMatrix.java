package BS;

public class SearchIn2DMatrix {

    // public static boolean searchMatrix(int[][] mat, int target) {
    //     int row = mat.length;
    //     int col = mat[0].length;
    //     boolean result = false;
    //     for(int i=0;i<row;i++){
    //         /*for(int j=0;j<col;j++){
    //             if(mat[i][j]==target){
    //                 result = true;
    //                 break;
    //             } 
    //         }*/
    //         if(found(mat[i],target)){
    //             result=true;
    //             return result;
    //         }
    //     }
    //     return result;
    // }
    // private static boolean found(int[] arr, int target) {
    //     int low = 0;
    //     int high = arr.length-1;
    //     while (low<=high) {
    //         int mid = (low+high)/2;
    //         if(arr[mid]==target) return true;
    //         if(arr[mid]<target) 
    //             low = mid+1;
    //         else 
    //             high = mid-1;
    //     }
    //     return false;
    // }

    // as they mentioned that the first element of row is greater than the last element of previous row
    // we can treat it as single 1D array

    public static boolean searchMatrix(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;
        int low = 0;
        int high = row*col-1;
        while (low<=high) {
            int mid = (low+high)/2;
            int r = mid/col;//which gives which row mid occured
            int c = mid%col; // in that row at which column the mid appeared
            int val = mat[r][c];
            if(val == target){
                return true;
            }
            if(val<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int  mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 8;
        System.out.println(searchMatrix(mat, target));
    }
}
