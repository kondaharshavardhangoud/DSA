import java.util.Scanner;

public class Hashing {
    private static void hashing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int num=sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        int hash[] = new int[13];
        for(int i=0;i<num;i++){
            hash[arr[i]] +=1;
        }
         
        System.out.println("Enter the size of query want to find");
        int num1= sc.nextInt();
        for(int i=0;i<num1;i++) {
            int num2 = sc.nextInt();
            System.out.println(hash[num2]);
        } 
    }
    public static void main(String[] args) {
        hashing();
    }
}
