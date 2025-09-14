import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("marks = ");
        int marks = sc.nextInt();
        IfElse.grades(marks);
    }
    private static void grades(int st){
        if(st>=90){
            System.out.println("Grade A");
        }else if(st>=70){
            System.out.println("Grade B");
        }else if(st>=50){
            System.out.println("Grade C");
        }else if(st>=35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}
