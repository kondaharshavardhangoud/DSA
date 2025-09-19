package HashingUsingArrays;
import java.util.Scanner;

public class HashingOfCharacters {
    private static void hashingOfCharacters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in lowerCase");
        String st = sc.nextLine();

        int hash[] = new int[25];
        for(int i=0;i<st.length();i++){
            hash[st.charAt(i)-'a'] +=1;
        }

        System.out.println("Enter the size of Characters you want to know length");
        int num1 = sc.nextInt();
        System.out.println("Enter the characters ");
        while(num1-->0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
        sc.close();

    }

    // using Both UPPER and lower cases
    private static void hashingOfCharactersBoth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String in lowerCase");
        String st = sc.nextLine();

        int hash[] = new int[256];
        for(int i=0;i<st.length();i++){
            hash[st.charAt(i)] +=1;
        }

        System.out.println("Enter the size of Characters you want to know length");
        int num1 = sc.nextInt();
        System.out.println("Enter the characters ");
        while(num1-->0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
        sc.close();

    }
    public static void main(String[] args) {
      //  hashingOfCharacters();
        hashingOfCharactersBoth();
    }
}
