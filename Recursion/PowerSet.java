package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        PowerSet p = new PowerSet();
        String name ="abc";
        int n=3;
        System.out.println(p.powerSet(name,n).toString());

    }
    public List<String> powerSet(String name,int n){
        List<String> result = new ArrayList<>();
        int total = 1<<n;
        for(int bit =0;bit<total;bit++){
            StringBuilder sb = new StringBuilder();
            for(int index =0;index<n;index++){
                if((bit & (1<<index))!=0){
                    sb.append(name.charAt(index));
                }
            }
            result.add(sb.toString());
        }
        return result;
    }
}
