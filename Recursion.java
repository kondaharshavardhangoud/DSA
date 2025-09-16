/*Recursion : Repeatatively calling the function itself until certain condition fulfilled */
public class Recursion {
    static void recursion(int i,int n){
        if(i>n) return;
        System.out.println("Using Recursion "+i);
        recursion(i+1,n);
    }

    // Printing Name 10 times using Recursion
    private static void recursion1(int i,int n){
        if(n<i) return;
        System.out.println(n+" Konda Harshavardhan Goud");
        recursion1(i, n-1);
    }

    // Printing Numbers  1-N using Recursion
     private static void recursion2(int i,int n){
        if(i>n) return;
        System.out.println(i);
        recursion2(i+1, n);
     }
     // Printing Numbers  N-1 using Recursion
     private static void recursion3(int i,int n){
        if(n<i) return;
        System.out.println(n);
        recursion3(i, n-1);
     }

     // Summing the N numbers
     private static int recursion4(int n){
        if(n<=0) return 0;
        return n+recursion4(n-1);
     }

     // Factorial of N numbers
     private static int recursion5(int n){
        if(n<=1) return 1;
        return n*recursion5(n-1);
     }
    public static void main(String[] args) {
        recursion(0,5);
        recursion1(0,10);
        recursion2(1, 10);
        recursion3(1, 10);
        System.out.println(recursion4(5));
        System.out.println(recursion5(5));
    }
    
}
