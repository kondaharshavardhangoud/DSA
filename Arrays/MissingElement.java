package Arrays;

public class MissingElement {
    private static void missingElement(int arr[],int N){
        int totalSum = (N*(N+1))/2;
        int actualSum=0;
        for(int i=0;i<N-1;i++){
            actualSum+=arr[i];
        }
        System.out.println(totalSum-actualSum);
    }
    public static void main(String[] args) {
        int N = 9;
        int arr[]={1,2,3,4,5,6,7,8};
        missingElement(arr,N);
    }
}
