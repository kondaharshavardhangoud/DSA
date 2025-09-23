package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,6,7,8,90};
        LargestElementClass.findLargestElement(arr);
    }
}
class LargestElementClass{
    public static void findLargestElement(int arr[]){
        int largestElement=arr[0];
        for(int i=0;i<arr.length;i++){
                if(arr[i]>largestElement){
                    largestElement = arr[i];
                }
        }
        System.out.println(largestElement);
    }
}