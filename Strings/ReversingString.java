package Strings;

import java.util.*;

public class ReversingString {
    // private static String reversingString(String s){
    //      int n = s.length();
    //      int i=0;
    //      int start = 0;
    //      int end =0;
    //      List<String> list  = new ArrayList<>();
    //      while (i<n) {
    //         while(i<n && s.charAt(i)==' ')i++;// runnign loop till ' ' encounter
    //         if(i>n) break; // there is no words
    //         start = i;
    //         while (i<n && s.charAt(i) !=' ') i++;// runnign loop  '' encounter
    //         end = i-1;
    //         list.add(s.substring(start, end+1));
    //      }
    //      StringBuilder sb = new StringBuilder();
    //      for(int j=list.size()-1;j>=0;j--){
    //         sb.append(list.get(j));
    //         if(j>0) sb.append(" ");
    //      }
    //      return sb.toString();
    // }

    private static String reversingString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int n = s.length();
        int start =0;
        int end =0;
        int i=0;
        while(i<n){
            while (i<n && sb.charAt(i)==' ') i++;
            if(i>=n) break;
            start = i;
            while (i<n && sb.charAt(i)!=' ')i++;
            end = i-1;
            reverse(sb,start,end); 
        }
        return sb.toString();
    }

    private static void reverse(StringBuilder sb, int start, int end) {
        int left = start;
        int right = end;
        while(left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "amazing coding skills";
        System.out.println(reversingString(s));
    }
}
