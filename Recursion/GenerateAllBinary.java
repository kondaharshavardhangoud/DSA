package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinary {
   public static void main(String[] args) {
     int n =3;
     List<String> res = new ArrayList<>();
    generateAllBinary(n,"",res);
    System.out.println(res.toString());
    
   }
   private static void generateAllBinary(int n2,String temp,List<String> st) {
        if(temp.length()==n2){
            st.add(temp);
            return;
        }
        generateAllBinary(n2, temp+"0", st);
        if(temp.isEmpty()||temp.charAt((temp.length()-1))!='1'){
            generateAllBinary(n2, temp+"1", st);
        }
    }
}
