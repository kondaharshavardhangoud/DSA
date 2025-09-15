import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        int num = 5;
       pattern1(num);
       pattern2(num);
       pattern3(num);
       pattern4(num);
       pattern6(num);
       pattern7(num);
       pattern8(num);
       pattern9(num);
       pattern10(num);
       pattern11(num);
       pattern12(num);
       pattern13(num);
       pattern14(num);
       pattern15(num);
       pattern16(num);
       pattern17(num);
       pattern18(num);
       pattern19(num);
       pattern20(num);
       pattern21(num);
       pattern22(num);
    }
    //Pattern 1
    
    private static void pattern1(int n){
        System.out.println("Pattern 1");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //Pattern 2
    private static void pattern2(int n){
        System.out.println("Pattern 2");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //Pattern 3
    private static void pattern3(int n){
        System.out.println("Pattern 3");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    //Pattern 4
    private static void pattern4(int n){
        System.out.println("Pattern 4");
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }
    //Pattern 5
    private static void pattern5(int n){
        System.out.println("Pattern 5");
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //Pattern 6
    private static void pattern6(int n){
        System.out.println("Pattern 6");
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }

    //Pattern 7
    private static void pattern7(int n){
        System.out.println("Pattern 7");
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //Pattern 8
    private static void pattern8(int n){
        System.out.println("Pattern 8");
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //pattern 9 
    private static void pattern9(int n){
        System.out.println("Pattern 9");
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("   ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

   //  pattern 10
    private static void pattern10(int n){
        System.out.println("Pattern 10");
        for(int i=0;i<2*n-1;i++){
            if(i>4){
                for(int j=0;j<2*n-i-1;j++){
                System.out.print(" * ");
                }
            }else{
                 for(int j=0;j<=i;j++){
                System.out.print(" * ");
                 }
            }
            System.out.println();
        }
    }

    // Pattern 11
     private static void pattern11(int n){
        System.out.println("Pattern 11");
        for(int i=0;i<n;i++){
            int key = i%2==0?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(" "+key+" ");
                key = 1-key;
            }
            System.out.println();
        }
     }

     // Pattern 12
     private static void pattern12(int n){
        System.out.println("Pattern 12");
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(" "+j+" ");
            }
            for(int j=0;j<2*(n-i)-2;j++){
                System.out.print("   ");
            }
            for(int j=i+1;j>0;j--){
                System.out.print(" "+j+" ");
            }
            
            System.out.println();
        }
     }

     // Pattern 13
     private static void pattern13(int n){
        System.out.println("Pattern 13");
        int number=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+ number++ +" ");
        }
        System.out.println();
     }
    }
    
     // Pattern 14
     private static void pattern14(int n){
        System.out.println("Pattern 14");
        for(int i=0;i<n;i++){
            for(char c='A';c<=i+65;c++){
                System.out.print(" "+c+" ");
        }
        System.out.println();
     }
    }

    // Pattern 15
     private static void pattern15(int n){
        System.out.println("Pattern 15");
        for(int i=0;i<n;i++){
            for(char c='A';c<n-i+65;c++){
                System.out.print(" "+c+" ");
        }
        System.out.println();
     }
    }

    // Pattern 16
     private static void pattern16(int n){
        System.out.println("Pattern 16");
        for(char c='A';c<='E';c++){
            for(char sc='A';sc<=c;sc++){
                System.out.print(" "+c+" ");
        }
        System.out.println();
     }
    }

    // Pattern 17
     private static void pattern17(int n){
        System.out.println("Pattern 17");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("   ");
        }
            for(char sc='A';sc<='A'+i;sc++){
                System.out.print(" "+sc+" ");
        }
        for(char sc=(char)('A'+i-1);sc>='A';sc--){
                System.out.print(" "+sc+" ");
        }
        System.out.println();
     }
    }

    // Pattern 18
     private static void pattern18(int n){
        System.out.println("Pattern 18");
        for(int i=0;i<n;i++){
            for(char sc=(char)('E'-i);sc<='E';sc++){
                System.out.print(" "+sc+" ");
        }
        System.out.println();
     }
    }

    // Pattern 19
     private static void pattern19(int n){
        System.out.println("Pattern 19");
        for(int i=0;i<n;i++){
        {
            for(int j=0;j<n-i;j++){
                System.out.print(" * ");
        }
        for(int j=0;j<2*i;j++){
                System.out.print("   ");
        }
        for(int j=0;j<n-i;j++){
                System.out.print(" * ");
        }
        }
        System.out.println();
     }
     for(int i=0;i<n;i++){
        {
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
        }
        for(int j=0;j<2*(n-i)-2;j++){
                System.out.print("   ");
        }
        for(int j=0;j<=i;j++){
                System.out.print(" * ");
        }
        }
        System.out.println();
     }
    }

    // Pattern 20
     private static void pattern20(int n){
        System.out.println("Pattern 20");
        for(int i=0;i<2*n-1;i++){
            if(i>4){
                    for(int j=0;j<2*n-i-1;j++){
                                System.out.print(" * ");
                        }
                        for(int j=0;j<2*(i-n)+2;j++){ 
                                System.out.print("   ");
                        }
                        for(int j=0;j<2*n-i-1;j++){
                                System.out.print(" * ");
                        }  
            }else{
                        for(int j=0;j<=i;j++){
                                System.out.print(" * ");
                        }
                        for(int j=0;j<2*(n-i)-2;j++){
                                System.out.print("   ");
                        }
                        for(int j=0;j<=i;j++){
                                System.out.print(" * ");
                        }                       
                }
            
        System.out.println();
     }
    }

    //pattern 21
    private static void pattern21(int n){
        System.out.println("Pattern 21");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
    }

    //pattern 22
    private static void pattern22(int n){
        System.out.println("Pattern 22");
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int bottom = 2*n-2-i;
                int left=j;
                int right = 2*n-2-j;
                System.out.print(" "+(n-(Math.min(Math.min(top,bottom),Math.min(left, right))))+" ");
            }
            System.out.println();
        }
    }


}
