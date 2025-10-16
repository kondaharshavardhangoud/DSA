package Recursion;

public class ImplementAtoi {
    public static void main(String[] args) {
        String name = "91283472332";
       
        int res = atoi(name);
       System.out.println(res);
        }

    private static int atoi(String name) {
         int i=0;
        int sigh =1;
        long total=0;
        int n = name.length();
        while (i<n &&  name.charAt(i)==' ') {
            i++;
        }
        if(i<n && (name.charAt(i)=='+' || name.charAt(i)=='-')){
               sigh = (name.charAt(i) == '-') ? -1 : 1;
                i++;
        }
        while(i<n){
            if(!Character.isDigit(name.charAt(i))) { 
                    break;
            }
             int c = name.charAt(i)-'0';
            //  if (total > (Integer.MAX_VALUE - c) / 10) {
            //    return (sigh==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            // }
            // if total long we can use 
             total = total*10+c;
            if (total * sigh > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (total * sigh < Integer.MIN_VALUE) return Integer.MIN_VALUE;
             i++;
            }
        return (int)(total*sigh);
    } 
       
    }
 
