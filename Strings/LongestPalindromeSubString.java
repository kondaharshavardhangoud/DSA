package Strings;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String s = "babab";
        System.out.println(longestPalindromeSubString(s));
    }

    private static String longestPalindromeSubString(String s) {
        int maxLen = Integer.MIN_VALUE;
        int start =0;
        int end =0;
       for(int center=0;center<s.length();center++){
            int oddLen = checkPalindrome(s,center,center);
            int evenLen = checkPalindrome(s,center,center+1);
            maxLen = Math.max(oddLen, evenLen);
            if(maxLen>end-start){
                start = center - (maxLen-1)/2;
                end = center + (maxLen)/2;
             }
            }
        return s.substring(start, end+1);
       }

    private static int checkPalindrome(String s, int center, int center2) {
       int left = center;
       int right = center2;
       while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right-left -1;//since left goes till -1 if it is palindrome and 
                            //right goes till length e.g left =-1 right = 3 then length 
                            // length = 3-(-1)-1 = 3
       }
    }


