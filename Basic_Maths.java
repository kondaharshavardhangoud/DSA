import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Basic_Maths {
    public static void main(String[] args) {
        System.out.println("Counting digits");
        System.out.println(countDigits(289677393));
        System.out.println("Reversing the Number");
        System.out.println(reverse(-944053120));
        System.out.println("Reversing with StringBuilder");
        System.out.println(reverseAll(944053120));
        System.out.println("Checking Palindrome");
        System.out.println(palindrome(121));
        System.out.println("Finding the GCD or HCF");
        System.out.println(findingGCD(12,35));
        System.out.println("Checking whether Amstrong or not");
        System.out.println(amstrongCheck(153));
        System.out.println("All the divisors");
        System.out.println(divisors(99));
        System.out.println("Checking for Prime");
        System.out.println(primeCheck(19));
    }

    // Checking Prime
    private static boolean primeCheck(int n){
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2) return true;
        int endPoint = (int)Math.sqrt(n);
        for(int i=3;i<=endPoint;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    //All divisors
     private static List<Integer> divisors(int n){
    //     int count =0;
    //    for(int j=1;j<=n;j++){
    //     if(n%j==0) count++;
    //    }
    //     int j=0;
    //     int arr[] = new int[count];
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0) arr[j++]=i;
    //     }
    //     return arr;

    // can also use collections 
    List<Integer> list = new ArrayList<>();
    for(int i=1;i<=n;i++){
        if(n%i==0) list.add(i);
    }
    return list;
    }

    // Checking Amstrong 
    private static boolean amstrongCheck(int n){
        StringBuilder st = new StringBuilder(String.valueOf(n));
        int size = st.length();
        int original = n;
        int amst =0;
        while(n>0){
            int digits=n%10;
            amst = amst + (int)Math.pow(digits,size);
            n /=10;
        }
       return original==amst ? true:false;
    }
    // Finding GCD or HCF
    private static int findingGCD(int x, int y) {
        while(x!=y){
            if(x>y){
                x=x-y;
            }else if(x<y){
                y=y-x;
            }else if(x==0){
                return y;
            }else if(y==0){
                return x;               
            }
        }
        return x;
    }

    // counting the number of digits
    private static int countDigits(int n){
        int count =0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    // reversing with int
    private static int reverse(int n){
        boolean isNegative = n<0;
        n=Math.abs(n);
        int rev =0;
        while(n>0){
            int digits = n%10;
            rev = rev *10 + digits;
            n = n/10;
        }
        return isNegative?-rev:rev;
    }

    // reversing with String

    private static String reverseAll(int n){
        StringBuilder number = new StringBuilder(String.valueOf(n));
        return number.reverse().toString();
    }

    // Palindrome

    private static boolean palindrome(int n){
        int original =n;
        int rev=0;
        while(n>0){
            int digits = n%10;
            rev=rev*10+digits;
            n /=10;
        }
        return rev==original?true:false;
    }
}
