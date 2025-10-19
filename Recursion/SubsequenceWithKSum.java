package Recursion;

public class SubsequenceWithKSum {
    public static void main(String[] args) {
        int k =10;
        int nums[]={4, 9, 2, 5, 1};
        int finalCount=0;
        int sum=0;
        int result =helperCount(nums,0,finalCount,sum,k);
        System.out.println((result>=1)?"Yes":"NO");
        System.out.println(result);
    }

    private static int helperCount(int[] nums, int i, int finalCount, int sum,int target) {
        if(i==nums.length){
           return (sum==target)?1:0;
        }
       int countExc = helperCount(nums, i+1, finalCount, sum, target);
      
       int countIncl = helperCount(nums, i+1, finalCount, sum+nums[i], target);
        return countExc+countIncl;
    }
}
