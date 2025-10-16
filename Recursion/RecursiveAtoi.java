package Recursion;

public class RecursiveAtoi {
    public static void main(String[] args) {
        String s = " -12345";
        int n = s.length();
        int i=0;
        int sign = 1;
        while (i<n && (s.charAt(i)==' ')) {
            i++;
        }
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = (s.charAt(i)=='-')?-1:1;
            i++;
        }
        int result = (int)aToi(s,i,0,sign);
        System.out.println(result);
    }

    private static long aToi(String s, int i, long num, int sign) {
       if(i>=s.length() || !Character.isDigit(s.charAt(i))){
          return num*sign;
       }
       int c = s.charAt(i)-'0';
       num = num*10+c;
       if (num * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
       return aToi(s, i+1, num, sign);
    }
}