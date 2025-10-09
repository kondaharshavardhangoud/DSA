package Strings;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
    String Str1 = "INTEGER";
    String Str2 = "TEGERNG";
    System.out.println(checkAnagrams(Str1, Str2));
    }

    // private static boolean checkAnagrams(String str1, String str2) {
    //    if(str1.length()!=str2.length()) return false;
    //     int hash[] = new int[26];
    //     for(int i=0;i<str1.length();i++){
    //         hash[str1.charAt(i)-'A']++;
    //     }
    //     for(int i=0;i<str1.length();i++){
    //         hash[str1.charAt(i)-'A']--;
    //     }
    //     for(int i=0;i<26;i++){
    //         if(hash[i]!=0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    private static String SortingString(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
     private static boolean checkAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        String s1 = SortingString(str1);
        String s2 = SortingString(str2);

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
     return true;
    }
}
