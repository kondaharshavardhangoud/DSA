package Strings;

import java.util.*;

public class LongestPrefix {
    private static String longestPrefix(String s[]){
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length-1];
        String ans = "";
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                ans+=first.charAt(i);
            }else{
                break;
            }
        }
       return  ans.equals("")?"":ans;
    }
    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        System.out.println(longestPrefix(str));
    }
}
