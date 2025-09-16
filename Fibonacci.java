import java.util.Arrays;

public class Fibonacci {
    //for the fibonacci of particular number 
    private static int fibonacci(int n){
        if(n==0||n==1) return n;
        return fibonacci(n-2)+fibonacci(n-1);
    }

    // for sequence of number of fibonacci
    private static int[] fibonacci1(int n){
        if(n<0) return new int[0];
        int result[] = new int[n+1];
        result[0]=0;
        if(n>0) result[1]=1;
        for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(14));
        System.out.println(Arrays.toString(fibonacci1(14)));
    }
}
