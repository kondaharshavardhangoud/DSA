package Arrays;

public class KadenesAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int k = kadanesAlgo(arr);
        System.out.println(k);
    }

    private static int kadanesAlgo(int[] arr) {
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        int maxSum =Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<arr.length;i++ ) {
            if(sum <=0 ){
                sum =arr[i];
                start =i;
            } 
            sum += arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
        }
        for(int j=ansStart;j<=ansEnd;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        return maxSum;
    }
}
