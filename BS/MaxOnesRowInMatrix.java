package BS;
public class MaxOnesRowInMatrix {
    private static int maxOnesRow(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int index =-1;
        int maxCount =0;
        for(int i=0;i<row;i++){
            int count =0;
            /*for(int j =0;j<col;j++){
                if(arr[i][j]==1) count++;
            } */
            count = col - lowerBound(arr[i],col,1); // removing from total arr length to first found 1 gives number of ones
            if(count>maxCount){
            maxCount = count;
            index = i;
            } 
        }
        return index;
    }
    private static int lowerBound(int arr[],int col,int k){
        int low = 0;
        int high = col-1;
        int ans =col;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=k){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int mat[][]={{0,0,1},{0,1,1},{0,0,0}};
        System.out.println(maxOnesRow(mat));
    }
}
