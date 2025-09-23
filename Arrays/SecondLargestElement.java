package Arrays;

public class SecondLargestElement {
    private static void secondLargestElement(int arr[]){
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("To find the second Largest element the array should contain atleast 2 elements");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestElement){
                secondLargestElement=largestElement;
                largestElement = arr[i];  
            }else if(arr[i]>secondLargestElement && arr[i]<largestElement){
                secondLargestElement=arr[i];
            }
        }
        if(secondLargestElement==Integer.MIN_VALUE){
                System.out.println("There is no secondLargest all are equal");
            }else{
                System.out.println(secondLargestElement);
            }
    }
    public static void main(String[] args) {
        int arr[]={112,4,1,3,69,4,5,7,88,89,100};
        secondLargestElement(arr);
    }
}
