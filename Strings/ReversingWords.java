package Strings;

import java.util.ArrayList;
import java.util.Stack;

public class ReversingWords {
    // private static String reversedWords(String s){
    //     int left =0;
    //     int right = s.length()-1;
    //     String temp ="";
    //     String ans = "";
    //     while (left<=right && s.charAt(left)==' ') {
    //         left++;
    //     } 
    //      while (right>=left && s.charAt(right)==' ') {
    //         right--;
    //     } 
    //     while (left<=right) {
    //        char ch = s.charAt(left);
    //        if(ch!=' '){
    //          temp += ch;
    //        }else if(ch==' '){
    //          ans = temp + (ans.equals("")?"":" " +ans);
    //          // adding comming temp + previous ans
    //          // if ans is empty then add nothing else add space + previous present ans
    //          temp = "";
    //        }
    //        left++;
    //     }
    //     if(!temp.equals("")){
    //         ans = temp + (ans.equals("")?"":" "+ans);
    //     }
    //    return ans; 
    // }

    private static String reversedWords(String s){
        Stack<String> st = new Stack<>();
        int left =0;
        int right = s.length()-1;
        String temp ="";
        while (left<=right) {
            char ch = s.charAt(left);
            if(ch!=' '){
                temp += ch;
            }else if(ch==' '){
                st.push(temp);
                temp="";
            }
            left++;
        }
        if(!temp.equals("")){
            st.push(temp);
        }
        // because at last we don't have any space it exit loop but we have word in temp so
        // adding it at last
        String ans ="";
        while(st.size()!=1){
            ans += st.peek()+" ";
            st.pop();
        }
        ans += st.peek();
        // we took 1 for checking stack size so that one word left at 
        //stack and we can add it at end without extra spacd
        return ans;
    }
    public static void main(String[] args) {
        String st = "this is an amazing program";
        System.out.println(reversedWords(st));
    }
}
