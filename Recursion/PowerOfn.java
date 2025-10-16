package Recursion;

public class PowerOfn {
    public static void main(String[] args) {
        double x =2.00000;
        int n=10;
        double power = powerOfn(x,n);
        System.out.println(power);
    }

    private static double powerOfn(double x, int n) {
        if(n==0) return 1;
        if(n<0) return 1/powerOfn(x, -n);
        double half =  powerOfn(x, n / 2);
        if(n%2==0) return half*half;
        else return half*half*x;
    }
}
