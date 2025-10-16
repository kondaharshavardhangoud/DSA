package LinkedList;

// public class GoodDigit {
//     public static void main(String[] args) {
//         int n=2;
//         int result = goodDigit(n,5,4);
//         System.out.println(result);
//     }

//     private static int goodDigit(int n, int even, int odd) {
//        if(n==0) return 1;
//        int res = goodDigit(n-1, even, odd);
//        if(n%2==1){
//            return res *=even;
//        }else{
//           return  res*=odd;
//        }
//     }

    public class Solution {
    
    static final int MOD = 1_000_000_007;
    
    // Recursive function to count good numbers
    public static int countGoodNumbers(int index, int n) {
        // Base case
        if (index == n) {  
            return 1;
        }
        
        int result = 0;
        // Even index
        if (index % 2 == 0) {  
            int[] evenDigits = {0, 2, 4, 6, 8};
            for (int digit : evenDigits) {
                result = (result + countGoodNumbers(index + 1, n)) % MOD;
            }
        } 
        // Odd index
        else {  
            int[] primeDigits = {2, 3, 5, 7};
            for (int digit : primeDigits) {
                result = (result + countGoodNumbers(index + 1, n)) % MOD;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 2;
        System.out.println(countGoodNumbers(0, n));
    }
}
//}
