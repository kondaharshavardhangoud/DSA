package Strings;

import java.util.ArrayList;

public class ReversingWords {
    private static String reversedWords(String s){
        int size = s.length();
        StringBuilder sbFinal = new StringBuilder();
        ArrayList<String> lt = new ArrayList<>();
        int j=0;
        for(int i=0;i<size;i++){
             StringBuilder sb = new StringBuilder();
            if(s.charAt(i)==' '){
                lt.add(s);
            }else{
              sb.append(s.charAt(i));
            }
        }
        for(int i=lt.size()-1;i>=0;i--){
            sbFinal.append(lt.get(i)+' ');
        }
        return sbFinal.toString();
    }
    public static void main(String[] args) {
        String st = "this is an amazing program";
        System.out.println(reversedWords(st));
    }
}
