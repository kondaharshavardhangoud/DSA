import java.util.Scanner;
public class FindingPrimes {
    private static boolean primes(int n){
        if(n<=1) return false;
        int squareRoot = (int)Math.sqrt(n);
        for(int i=2;i<=squareRoot;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
            for(int i=n;i<m;i++){
                if(primes(i)){
                    System.out.println(i);}
            }
        sc.close();
    }
}
