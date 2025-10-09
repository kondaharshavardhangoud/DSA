package Strings;

public class LargestOddnumberInString {
    private static String oddNumberString(String s){
        int n = s.length();
        int left =0;
        int right = n-1;
        String ans ="";
        while (right>=0) {
            int n1 = s.charAt(right)-0;
            if(n1%2==1){
                ans = s.substring(left, right+1);
                break;
            }
            right--;
        }
        left=0;
        while (left<=right && s.charAt(left)=='0') {
             left++;
        }
        return s.substring(left, right+1);
    }
    public static void main(String[] args) {
        String num = "0214638";
        System.out.println(oddNumberString(num));
    }
}
