//input-output
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Entered Number is : " + number);
    }
}

