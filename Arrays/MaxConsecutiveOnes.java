package Arrays;

public class MaxConsecutiveOnes {
         private static void maxConsecutiveOnes(int arr[]){
         int maxOnes=0;
         int currentCount =0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
               currentCount++;
               if(currentCount>maxOnes){
                 maxOnes=currentCount;
               } 
            }else if(arr[i]==0){
                currentCount=0;
            }
         }   
         System.out.println(maxOnes);
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,0,1,1,1,0,0,0};
        maxConsecutiveOnes(arr);
    }
}
